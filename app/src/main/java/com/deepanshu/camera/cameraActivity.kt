package com.deepanshu.camera

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView

class cameraActivity : AppCompatActivity() {
   private lateinit var image1 : ImageView
            var our_request_code :Int =123;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        image1 = findViewById(R.id.image1)

    }
    fun takePhoto(view: View){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        // start the result
        // checj=k if the task can be perfoem or not
        if(intent.resolveActivity(packageManager)!=null){
            startActivityForResult(intent,our_request_code)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == our_request_code && resultCode == RESULT_OK) {
            // if result is ok and our request code is equal to request code
            val imageView: ImageView = findViewById(R.id.image)
            // start bitmap
            val bitmap = data?.extras?.get("data") as Bitmap
            // set Image bitmap
            imageView.setImageBitmap(bitmap)
        }

    }
}
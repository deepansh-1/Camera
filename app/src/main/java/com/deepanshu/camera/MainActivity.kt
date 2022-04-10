package com.deepanshu.camera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            image = findViewById(R.id.image);

        image.setOnClickListener {
            val intent = Intent(this,cameraActivity::class.java);
            startActivity(intent)
        }


    }
}
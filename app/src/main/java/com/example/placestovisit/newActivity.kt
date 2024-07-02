package com.example.placestovisit

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class newActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        supportActionBar?.hide()
        val newcontent = intent.getStringExtra("content")
        val newimage = intent.getIntExtra("image",R.drawable.effel)
     var image = findViewById<ImageView>(R.id.imageview)
       var text = findViewById<TextView>(R.id.textview)
        image.setImageResource(newimage)
       text.text = newcontent

    }



}

package com.example.placestovisit

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class newindiaActivity :AppCompatActivity() {
    lateinit var myimage:ImageView
    lateinit var mycontent:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newindia)
        supportActionBar?.hide()
        var content = intent.getStringExtra("content")
        var image = intent.getIntExtra("image",R.drawable.lotus)
        myimage = findViewById<ImageView>(R.id.imageview)
        mycontent = findViewById<TextView>(R.id.textview)
        myimage.setImageResource(image)
        mycontent.text =content

    }}

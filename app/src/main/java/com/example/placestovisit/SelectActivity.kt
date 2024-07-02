package com.example.placestovisit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SelectActivity: AppCompatActivity()  {
    lateinit var card1 :CardView
    lateinit var card2 :CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        supportActionBar?.hide()
        card1 = findViewById<CardView>(R.id.card1)
        card2 = findViewById<CardView>(R.id.card2)
        card1.setOnClickListener{
            var intent = Intent(this,RecycleActivity::class.java)
            startActivity(intent)

        }
        card2.setOnClickListener{
            var intent = Intent(this,RecycleIndiaActivity::class.java)
            startActivity(intent)
        }
    }
}

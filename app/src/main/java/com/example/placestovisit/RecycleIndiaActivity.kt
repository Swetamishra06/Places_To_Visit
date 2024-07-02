package com.example.placestovisit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import layout.place2

class RecycleIndiaActivity : AppCompatActivity() {
    lateinit var recview :RecyclerView
lateinit var myarray : ArrayList<place2>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_india)
        supportActionBar?.hide()
        recview = findViewById<RecyclerView>(R.id.rview)
        recview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val pname = arrayOf("LOTUS TEMPLE", "TAJ MAHAL","AKSHARDHAM TEMPLE","PREM MANDIR","INDIA GATE")
        val pplace = arrayOf(R.drawable.lotus,R.drawable.tajmahal,R.drawable.akshardham,R.drawable.prem,R.drawable.indiagate)
        val pcontent = arrayOf(getString(R.string.mycontent1),getString(R.string.mycontent2),getString(R.string.mycontent3),getString(R.string.mycontent4),getString(R.string.mycontent5))


          myarray = ArrayList<place2>()
          for(index in pname.indices){
              val details = place2(pname[index],pcontent[index],pplace[index])
              myarray.add(details)
          }
        val myadapter = Mysecondadapter(myarray,this)
        recview.adapter = myadapter

        myadapter.seteachitemclicklistener ( object : Mysecondadapter.onclickinterface{
            override fun oneachitem (position : Int) {
//onclick each item

                var intent = Intent(this@RecycleIndiaActivity,newindiaActivity::class.java)
                intent.putExtra("image",myarray[position].image)
                intent.putExtra("content",myarray[position].content)
                startActivity(intent)
            }


        })


        }
    }





package com.example.placestovisit
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.place

class RecycleActivity : AppCompatActivity() {
    lateinit var myview:RecyclerView
    lateinit var places_name : ArrayList<place>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)
        supportActionBar?.hide()
        myview = findViewById<RecyclerView>(R.id.rview)

        myview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)

        val pname = arrayOf(
            " EIFFEL TOWER ",
            " BARI BARI ",
            " GLACIER NATIONAL PARK ",
            " KYOTO ",
            " MACHU PICCHU"
        )
        val pplace = arrayOf(
            R.drawable.effel,
            R.drawable.bari,
            R.drawable.glacier,
            R.drawable.koyto,
            R.drawable.machu
        )
        val pcontent = arrayOf(getString(R.string.content1),getString(R.string.content2),getString(R.string.content3),getString(R.string.content4),getString(R.string.content5))
        places_name = ArrayList<place>()
        for (index in pname.indices) {
            val detail = place(pname[index], pplace[index],pcontent[index])
            places_name.add(detail)

        }
        var adapter = liveAdapter(places_name, this)
        myview.adapter = adapter

        adapter.setitemclicklistener(object : liveAdapter.mycustomlistener{
            override fun oneachitemclick(position: Int) {
                val intent = Intent(this@RecycleActivity, newActivity::class.java)
                intent.putExtra("content",places_name[position].mycontent)
                intent.putExtra("image",places_name[position].mypicture)
                startActivity(intent)


            }
        })

    }

}
package com.example.placestovisit;

import android.app.Activity;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import layout.place

 class liveAdapter(var place_array :ArrayList<place>, var context :Activity)
     //recyclerview.adapter inherit ,in which custom  my view holder for this (live adapter) is created
    :RecyclerView.Adapter<liveAdapter.MyViewHolder>() {
//initialize the var of type interface (mycustomlistener)

    private lateinit var thislistener: mycustomlistener
    //created interface
    interface mycustomlistener {
        //abstract method
        fun oneachitemclick(position: Int)
    }

    fun setitemclicklistener(listener :mycustomlistener){
        thislistener=listener

    }

    class MyViewHolder(itemView: View,listener : mycustomlistener) :RecyclerView.ViewHolder(itemView){
        val heading: TextView = itemView.findViewById(R.id.heading)
        val image: ImageView = itemView.findViewById(R.id.picture)

// init executed as soon as class is initiated
        init {
            itemView.setOnClickListener {
                listener.oneachitemclick(adapterPosition)
            }
        }
    }



    override fun getItemCount(): Int {
        return place_array.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         val  myeachitem = LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
         return MyViewHolder(myeachitem,thislistener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val currentitem = place_array[position]
        holder.heading.text = currentitem.myname
        holder.image.setImageResource(currentitem.mypicture)
    }

}




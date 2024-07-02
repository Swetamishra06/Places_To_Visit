package com.example.placestovisit

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import layout.place2

class Mysecondadapter(
    private var myarray: ArrayList<place2>,
    private var context: Activity) : RecyclerView.Adapter<Mysecondadapter.myViewHolder>() {
    lateinit var Mylistener : onclickinterface


    interface onclickinterface{
//abstract method
      fun oneachitem(Position :Int)

    }

    class myViewHolder(myview: View, Mylistener: onclickinterface) :RecyclerView.ViewHolder(myview){
      val heading : TextView =  myview.findViewById<TextView>(R.id.heading)
        val image  : ImageView = myview.findViewById<ImageView>(R.id.picture)
        init{
            myview.setOnClickListener {
                Mylistener.oneachitem(adapterPosition)
        }
}

    }

    fun seteachitemclicklistener(param: onclickinterface) {
        Mylistener= param

    }
//get the size of the array
    override fun getItemCount(): Int {
        return myarray.size
    }
//creates  the view by accepting xml layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
       val myview = LayoutInflater.from(parent.context).inflate(R.layout.eachitem1,parent,false)
        return myViewHolder(myview,Mylistener)
    }
//updation of each item in recycler view
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentitem = myarray[position]
        holder.heading.text = currentitem.name
        holder.image.setImageResource(currentitem.image)
    }

  }


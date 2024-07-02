package com.example.placestovisit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import userinput

class MainActivity : AppCompatActivity() {
    // Declare variable for database reference
    private lateinit var databaseRef: DatabaseReference
    private lateinit var btn: Button
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var avatar: ImageView
    private lateinit var signin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        // Initialize and get reference from Firebase
        avatar = findViewById(R.id.avatar)
        avatar.setOnClickListener {
            var intent = Intent(this, AvatarActivity::class.java)
            startActivityForResult(intent,1)
            //expecting result from avatar activity
        }

        databaseRef = FirebaseDatabase.getInstance().reference

        name = findViewById(R.id.View1)
        email = findViewById(R.id.View2)
        password = findViewById(R.id.View4)
        btn = findViewById(R.id.appCompatButton2)
        signin = findViewById(R.id.signin)

        btn.setOnClickListener {
            val fname = name.text.toString()
            val emailid = email.text.toString()
            val pass = password.text.toString()

            if (fname.isEmpty() || emailid.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Fields Cannot be Empty", Toast.LENGTH_SHORT).show()
            } else {
                val objUser = userinput(fname, emailid, pass)
                // Create reference variable to get the root to send the data
                val ref = databaseRef.child("alldetail")
                // Using root selected a unique child to send via it
                ref.child(pass).setValue(objUser).addOnSuccessListener {
                    Toast.makeText(this, "Successfully Signed In", Toast.LENGTH_SHORT).show()
                    var intent = Intent(this,SelectActivity::class.java)
                    startActivity(intent)
                }.addOnFailureListener {
                    Toast.makeText(this, "Connection Failed", Toast.LENGTH_SHORT).show()
                }
            }
        }

        signin.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }}
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)

            if (requestCode == 1 && resultCode == RESULT_OK) {
                val imageResource = data?.getIntExtra("image1", 0)
                if (imageResource != null && imageResource != 0) {
                    avatar.setImageResource(imageResource)
                } else {
                    // Set default image if no image is received
                    avatar.setImageResource(R.drawable.edit2)
                }
            }
        }

    }


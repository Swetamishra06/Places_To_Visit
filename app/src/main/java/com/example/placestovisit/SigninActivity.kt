package com.example.placestovisit;


import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SigninActivity : AppCompatActivity() {
    private lateinit var ref1: DatabaseReference
    private lateinit var save: Button
    private lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        supportActionBar?.hide()
        pass = findViewById(R.id.myView)
        save = findViewById(R.id.Button2) // Make sure the ID matches your XML layout
        ref1 = FirebaseDatabase.getInstance().reference.child("alldetail")

        save.setOnClickListener {
            val password = pass.text.toString()

            if (password.isEmpty()) {
                Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show()
            } else {
                operation(password)

            }
        }
    }

    private fun operation(password: String) {
        ref1.child(password).get().addOnSuccessListener {
            if (it.exists()) {
                val name = it.child("name").value.toString()
                Toast.makeText(this,"welcome here.....",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SelectActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
            } else {
                Toast.makeText(this, "User Does Not Exist, Please Sign Up First to Continue", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            Toast.makeText(this, "Connection Failed! Retry", Toast.LENGTH_SHORT).show()
        }
    }
}



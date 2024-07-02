package com.example.placestovisit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class AvatarActivity : AppCompatActivity(){

    lateinit var i1:ImageView
    lateinit var i2:ImageView
    lateinit var i3:ImageView
    lateinit var i4:ImageView
    lateinit var i5:ImageView
    lateinit var i6:ImageView
    lateinit var i7:ImageView
    lateinit var i8:ImageView
    lateinit var i9:ImageView
    lateinit var i10:ImageView
    lateinit var i11:ImageView
    lateinit var i12:ImageView
    lateinit var i13:ImageView
    lateinit var i14:ImageView
    lateinit var i15:ImageView
    lateinit var i16:ImageView
    lateinit var i17:ImageView
    lateinit var i18:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_avatar)
        i1 = findViewById<ImageView>(R.id.i1)
        i2 = findViewById<ImageView>(R.id.i2)
        i3 = findViewById<ImageView>(R.id.i3)
        i4 = findViewById<ImageView>(R.id.i4)
        i5 = findViewById<ImageView>(R.id.i5)
        i6 = findViewById<ImageView>(R.id.i6)
        i7 = findViewById<ImageView>(R.id.i7)
        i8 = findViewById<ImageView>(R.id.i8)
        i9 = findViewById<ImageView>(R.id.i9)
        i10 = findViewById<ImageView>(R.id.i10)
        i11 = findViewById<ImageView>(R.id.i11)
        i12 = findViewById<ImageView>(R.id.i12)
        i13 = findViewById<ImageView>(R.id.i13)
        i14 = findViewById<ImageView>(R.id.i14)
        i15 = findViewById<ImageView>(R.id.i15)
        i16= findViewById<ImageView>(R.id.i16)
        i17 = findViewById<ImageView>(R.id.i17)
        i18 = findViewById<ImageView>(R.id.i18)

        i1.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.g3)
            setResult(RESULT_OK,intent)
            finish()
        }
        i2.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.b14)
            setResult(RESULT_OK,intent)

            finish()
        }
        i3.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.g4)
            setResult(RESULT_OK,intent)

            finish()
        }
        i4.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.b1)
            setResult(RESULT_OK,intent)

            finish()
        }
        i5.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.b10)
            setResult(RESULT_OK,intent)

            finish()
        }
        i6.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.w1)
            setResult(RESULT_OK,intent)

            finish()
        }
        i7.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.w2)
            setResult(RESULT_OK,intent)

            finish()
        }
        i8.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.g1)
            setResult(RESULT_OK,intent)

            finish()
        }
        i9.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.w4)
            setResult(RESULT_OK,intent)

            finish()
        }
        i10.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.b11)
            setResult(RESULT_OK,intent)

            finish()
        }
        i11.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.b8)
            setResult(RESULT_OK,intent)

            finish()
        }
        i12.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.w7)

            setResult(RESULT_OK,intent)
            finish()
        }
        i13.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.w6)
            setResult(RESULT_OK,intent)
            finish()
        }
        i14.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.b5)
            setResult(RESULT_OK,intent)

            finish()
        }
        i15.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.w5)
            setResult(RESULT_OK,intent)

            finish()
        }
        i16.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("image1", R.drawable.b7)
            setResult(RESULT_OK,intent)

            startActivity(intent)
            finish()
        }
        i17.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("image1", R.drawable.b9)
            setResult(RESULT_OK,intent)
            startActivity(intent)
            finish()
        }
        i18.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("image1",R.drawable.mulli)
            setResult(RESULT_OK,intent)
            startActivity(intent)
            finish()
        }

    }

    }

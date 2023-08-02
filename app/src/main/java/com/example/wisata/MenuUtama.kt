package com.example.wisata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuUtama : AppCompatActivity() {
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null
    var button6: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
        button1 = findViewById<View>(R.id.button1) as Button
        button2 = findViewById<View>(R.id.button2) as Button
        button3 = findViewById<View>(R.id.button3) as Button
        button4 = findViewById<View>(R.id.button4) as Button
        button5 = findViewById<View>(R.id.button5) as Button
        button6 = findViewById<View>(R.id.button6) as Button
        button1!!.setOnClickListener {
            val intent = Intent(this@MenuUtama, WisataAlam::class.java)
            finish()
            startActivity(intent)
        }
        button2!!.setOnClickListener {
            val intent = Intent(this@MenuUtama, WisataEdukasi::class.java)
            finish()
            startActivity(intent)
        }
        button3!!.setOnClickListener {
            val intent = Intent(this@MenuUtama, WisataReligi::class.java)
            finish()
            startActivity(intent)
        }
        button4!!.setOnClickListener {
            val intent = Intent(this@MenuUtama, WisataKuliner::class.java)
            finish()
            startActivity(intent)
        }
        button5!!.setOnClickListener {
            val intent = Intent(this@MenuUtama, About::class.java)
            finish()
            startActivity(intent)
        }
        button6!!.setOnClickListener {
            // TODO Auto-generated method stub
            moveTaskToBack(true)

            //membuat method tombol keluar dari aplikasinya
        }
    }
}
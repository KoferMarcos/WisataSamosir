package com.example.wisata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {
    var btkembali: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        btkembali = findViewById<View>(R.id.btkembali) as Button
        btkembali!!.setOnClickListener {
            val intent = Intent(this@About, MenuUtama::class.java)
            finish()
            startActivity(intent)
        }
    }
}
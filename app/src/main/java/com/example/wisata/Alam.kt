package com.example.wisata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Alam : AppCompatActivity() {
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null
    var button6: Button? = null
    var back: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alam)
        button1 = findViewById<View>(R.id.button1) as Button
        button2 = findViewById<View>(R.id.button2) as Button
        button3 = findViewById<View>(R.id.button3) as Button
        button4 = findViewById<View>(R.id.button4) as Button
        button5 = findViewById<View>(R.id.button5) as Button
        button6 = findViewById<View>(R.id.button6) as Button
        back = findViewById<View>(R.id.back) as Button
        button1!!.setOnClickListener {
            val intent = Intent(this@Alam, Danau::class.java)
            finish()
            startActivity(intent)
        }
        back!!.setOnClickListener {
            val intent = Intent(this@Alam, MenuUtama::class.java)
            finish()
            startActivity(intent)
        }
    }
}
package com.example.wisata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class WisataReligi : AppCompatActivity() {
    var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_religi)
        listView = findViewById<View>(R.id.list) as ListView
        val values = arrayOf(
            "Masjid Raya Al-Hasanah", "Gereja HKBP Pangururan"
        )
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, android.R.id.text1, values
        )
        listView!!.adapter = adapter
        listView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                val myIntent = Intent(view.context, Masjid::class.java)
                startActivityForResult(myIntent, 0)
            }
            if (position == 1) {
                val myIntent = Intent(view.context, Gereja::class.java)
                startActivityForResult(myIntent, 0)
            }
        }
    }
}
package com.example.practice5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.practice5.adapter.ItemAdapter
import com.example.practice5.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mydata=DataSource().loadAffirmations()
        val recycle= findViewById<RecyclerView>(R.id.recyclerview)
        recycle.adapter=ItemAdapter(this,mydata)
        recycle.setHasFixedSize(true)

    }
}
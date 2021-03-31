package com.example.practice5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice5.R
import com.example.practice5.model.Affirmation

class ItemAdapter(private val context: Context,private val data : List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView= view.findViewById(R.id.item_title)
        val imageView: ImageView=view.findViewById(R.id.item_img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item =data[position]
        holder.textView.text= context.resources.getString(item.ResId )
        holder.imageView.setImageResource(item.imageResourceId)


    }

    override fun getItemCount()= data.size
}
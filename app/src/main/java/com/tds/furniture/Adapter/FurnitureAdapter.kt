package com.tds.furniture.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tds.furniture.R
import com.tds.furniture.model.Furniture

class FunitureViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var name = itemView.findViewById<TextView>(R.id.name_trending)
    var price = itemView.findViewById<TextView>(R.id.price_trending)
    var image = itemView.findViewById<ImageView>(R.id.image_trending)
}

class FurnitureAdapter(var furnitureList: ArrayList<Furniture>): RecyclerView.Adapter<FunitureViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunitureViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_trending, parent, false)
        return FunitureViewHolder(view)
    }

    override fun getItemCount(): Int {
        return furnitureList.size
    }

    override fun onBindViewHolder(holder: FunitureViewHolder, position: Int) {
        holder.name.text = furnitureList[position].name
        holder.price.text = furnitureList[position].price.toString()
        holder.image.setImageResource(furnitureList[position].image)

    }

}
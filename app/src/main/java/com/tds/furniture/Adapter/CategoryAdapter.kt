package com.tds.furniture.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tds.furniture.R
import com.tds.furniture.model.Category
import kotlinx.android.synthetic.main.item_discover.view.*

class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var categoryName = itemView.findViewById<TextView>(R.id.txt_item_name)
    var categoryCount = itemView.findViewById<TextView>(R.id.item_count)
    var categoryImage = itemView.findViewById<ImageView>(R.id.image_discover)
}

class CategoryAdapter(var categoryList: ArrayList<Category>): RecyclerView.Adapter<CategoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_discover, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        holder.categoryName.text = categoryList[position].categoryName
        holder.categoryCount.text = categoryList[position].categoryCount.toString()
        holder.categoryImage.setImageResource(categoryList[position].categoryImage)


    }

}
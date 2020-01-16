package com.tds.furniture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tds.furniture.Adapter.CategoryAdapter
import com.tds.furniture.Adapter.FurnitureAdapter
import com.tds.furniture.model.Category
import com.tds.furniture.model.Furniture

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*categoryView()
        furnitureView()*/

        var categoryRecyclerView : RecyclerView = findViewById(R.id.recycler_furniture)

        var categoryList = ArrayList<Category>()

        categoryList.add(Category(R.drawable.chair, "Chair", 1122))
        categoryList.add(Category(R.drawable.chair, "Tables", 1122))
        categoryList.add(Category(R.drawable.chair, "Sofa", 1122))

        var categoryAdapter = CategoryAdapter(categoryList)

        categoryRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        categoryRecyclerView.adapter = categoryAdapter

        var furnitureRecyclerView : RecyclerView = findViewById(R.id.recycler_trending)

        var furnitureList = ArrayList<Furniture>()

        furnitureList.add(Furniture("Ivonne Chair, green", 29.00, R.drawable.chair))
        furnitureList.add(Furniture("Snake skin Pattern Bluckle", 44.00, R.drawable.chair))
        furnitureList.add(Furniture("Arm Korea green", 29.00, R.drawable.chair))

        var furnitureAdapter = FurnitureAdapter(furnitureList)

        furnitureRecyclerView.layoutManager = LinearLayoutManager(this)
        furnitureRecyclerView.adapter = furnitureAdapter


        var bestSellingRecyclerView : RecyclerView = findViewById(R.id.recycler_best_selling)

        var bestSellingList = ArrayList<Furniture>()
        bestSellingList.add(Furniture("Ruffle Trim", 29.00, R.drawable.chair))
        bestSellingList.add(Furniture("Leaf Floral", 29.00, R.drawable.chair))
        bestSellingList.add(Furniture("Drop Shoulder", 29.00, R.drawable.chair))

        var bestSellerAdapter = FurnitureAdapter(bestSellingList)

        bestSellingRecyclerView.layoutManager = LinearLayoutManager(this)
        bestSellingRecyclerView.adapter = bestSellerAdapter

    }

    /*private fun categoryView(){
        var categoryRecyclerView : RecyclerView = findViewById(R.id.recycler_furniture)

        var categoryList = ArrayList<Category>()

        categoryList.add(Category(R.drawable.chair, "Chair", 1122))
        categoryList.add(Category(R.drawable.chair, "Tables", 1122))
        categoryList.add(Category(R.drawable.chair, "Sofa", 1122))

        var categoryAdapter = CategoryAdapter(categoryList)

        categoryRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        categoryRecyclerView.adapter = categoryAdapter
    }*/

    /*private fun furnitureView(){
        var furnitureRecyclerView : RecyclerView = findViewById(R.id.recycler_trending)

        var furnitureList = ArrayList<Furniture>()

        furnitureList.add(Furniture("Ivonne Chair, green", 29.00, R.drawable.chair))
        furnitureList.add(Furniture("Snake skin Pattern Bluckle", 44.00, R.drawable.chair))
        furnitureList.add(Furniture("Arm Korea green", 29.00, R.drawable.chair))

        var furnitureAdapter = FurnitureAdapter(furnitureList)

        furnitureRecyclerView.layoutManager = LinearLayoutManager(this)
        furnitureRecyclerView.adapter = furnitureAdapter
    }*/

   /* fun bestSellingView(){
        var bestSellingRecyclerView : RecyclerView = findViewById(R.id.recycler_best_selling)

        var bestSellingList = ArrayList<Furniture>()
        bestSellingList.add(Furniture("Ruffle Trim", 29.00, R.drawable.chair))
        bestSellingList.add(Furniture("Leaf Floral", 29.00, R.drawable.chair))
        bestSellingList.add(Furniture("Drop Shoulder", 29.00, R.drawable.chair))

        var bestSellerAdapter = FurnitureAdapter(bestSellingList)

        bestSellingRecyclerView.layoutManager = LinearLayoutManager(this)
        bestSellingRecyclerView.adapter = bestSellerAdapter
    }*/
}

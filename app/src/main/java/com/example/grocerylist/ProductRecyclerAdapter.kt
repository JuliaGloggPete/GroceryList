package com.example.grocerylist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class ProductRecyclerAdapter(val context: Context, val produkts: List<Produkt>) :
    RecyclerView.Adapter<ProductRecyclerAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produkt = produkts[position]

        holder.produktNameTextView.text = produkt.name
        holder.priceextView.text = produkt.price.toString()
        holder.produktImage.id = produkt.produkImage
    }

    override fun getItemCount()= produkts.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val produktNameTextView = itemView.findViewById<TextView>(R.id.tv_produktName)
        val priceextView = itemView.findViewById<TextView>(R.id.tv_price)
        val produktImage = itemView.findViewById<ImageView>(R.id.iv_productImage)


    }

}
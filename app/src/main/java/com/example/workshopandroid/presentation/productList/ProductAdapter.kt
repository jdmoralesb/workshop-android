package com.example.workshopandroid.presentation.productList

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workshopandroid.databinding.ItemProductBinding
import com.example.workshopandroid.entity.Product

class ProductAdapter(
    private val values: List<Product>,
    private val onItemClickListener: ((item: Product) -> Unit)? = null
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.textName.text = item.name
        holder.textDescription.text = item.description
        holder.imageProduct.setImageResource(item.image)

        holder.itemView.setOnClickListener {
            onItemClickListener?.let { it(item) }
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        val textName: TextView = binding.textName
        val textDescription: TextView = binding.textDescription
        val imageProduct: ImageView = binding.imageProduct
    }
}
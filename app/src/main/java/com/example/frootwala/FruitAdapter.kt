package com.example.frootwala

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(
    private val FruitList: ArrayList<FruitData>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_items, parent, false)
        return FruitViewHolder(itemFruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit = FruitList[position]
        holder.bindFruit(currentFruit)
    }

    override fun getItemCount(): Int {
        return FruitList.size
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fruitDetails: TextView
        private val fruitImage: ImageView

        init {
            fruitImage = itemView.findViewById(R.id.fruitImage)
            fruitDetails = itemView.findViewById(R.id.fruitName)
            itemView.setOnClickListener {
                val currentPosition = FruitList[layoutPosition]
                val intent = Intent(itemView.context, FruitDetails::class.java)
                intent.putExtra("FRUIT_NAME", currentPosition.FruitName)
                intent.putExtra("FRUIT_IMAGE", currentPosition.FruitImage)
                intent.putExtra("FRUIT_COLOUR", currentPosition.FruitColor)
                intent.putExtra("FRUIT_DESCRIPTION", currentPosition.FruitDescription)
                itemView.context.startActivity(intent)



            }
        }

        fun bindFruit(fruit: FruitData) {
            fruitDetails.text = fruit.FruitName
            fruitImage.setImageResource(fruit.FruitImage)

        }
    }
}

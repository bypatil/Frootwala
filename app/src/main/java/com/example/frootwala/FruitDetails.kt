package com.example.frootwala

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class FruitDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fruit_details_item)

        val fruitImage: ImageView = findViewById(R.id.imageInfo)
        val fruitText: TextView = findViewById(R.id.textInfo)
        val shareButton: Button = findViewById(R.id.shareBtn)
        val fruitName = intent.getStringExtra("FRUIT_NAME")
        val fruitPhoto = intent.getIntExtra("FRUIT_IMAGE", 0)
        val fruitColour = intent.getStringExtra("FRUIT_COLOUR")
        val fruitDescription = intent.getStringExtra("FRUIT_DESCRIPTION")
        fruitText.text =
            "*Name*: $fruitName \n*Its color*: $fruitColour \n*Short Description*: $fruitDescription "
        fruitImage.setImageResource(fruitPhoto)
        shareButton.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Share")
            sendIntent.type = "text/plain"
            startActivity(sendIntent)

        }
    }
}
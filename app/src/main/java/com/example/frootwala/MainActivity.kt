package com.example.frootwala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fruitAdapter: FruitAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)
        if (resources.configuration.screenWidthDp > resources.configuration.smallestScreenWidthDp) {
            recyclerView.layoutManager = GridLayoutManager(this, 3)
        } else {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }
        val listOFruits = getListOfFruits()
        fruitAdapter = FruitAdapter(listOFruits as ArrayList<FruitData>)
        recyclerView.adapter = fruitAdapter

    }

    private fun getListOfFruits(): MutableList<FruitData> {
        val fruits = mutableListOf<FruitData>()
        fruits.add(
            FruitData(
                "Orange",
                "Orange",
                R.drawable.orange_,
                "Advantages of Oranges:\n" +
                        "\n" +
                        "Help Your Body Stay Strong: Oranges have lots of vitamin C, which helps your immune system fight off sickness. It's like a shield that keeps you healthy.\n" +
                        "\n" +
                        "Help with Digestion: Oranges have stuff called fiber, which helps your tummy work better and keeps you feeling good inside.\n" +
                        "\n" +
                        "They Fight Bad Stuff: Oranges have things called antioxidants that help your body stay healthy by fighting off bad things.\n" +
                        "\n" +
                        "Disadvantages of Oranges:\n" +
                        "\n" +
                        "Some People Might Feel Funny: Oranges can be a bit sour for some people, especially those with a sensitive tummy or who get heartburn easily.\n" +
                        "\n" +
                        "They Have Sugar: Oranges have natural sugars, so eating a lot might not be great for those who need to watch their sugar.\n" +
                        "\n" +
                        "Nutritional Info (For a Medium Orange):\n" +
                        "\n" +
                        "Proteins: Oranges don’t have much protein – just about as much as in a small spoonful of peanut butter.\n" +
                        "\n" +
                        "Vitamin C: Oranges have a lot of vitamin C, which helps your body stay strong and healthy.\n" +
                        "\n" +
                        "Fiber: They have some fiber, which is good for your tummy and helps you go to the bathroom regularly.\n" +
                        "\n" +
                        "Calories: Oranges don’t have many calories, which is good if you're watching your weight."
            )
        )
        fruits.add(
            FruitData(
                "Apple",
                "Red",
                R.drawable.apple_,
                "Advantages of Apples:\n" +
                        "\n" +
                        "Help Your Tummy: Apples have something called fiber that helps you digest food and makes your tummy happy.\n" +
                        "\n" +
                        "They Keep You Fresh: Apples have lots of water, so they keep you hydrated and feeling refreshed.\n" +
                        "\n" +
                        "Vitamins and Good Stuff: They have vitamins that are like superheroes for your body, helping you stay healthy and fighting off sickness.\n" +
                        "\n" +
                        "Disadvantages of Apples:\n" +
                        "\n" +
                        "Might Have Some Pesticides: Sometimes, the outside of apples might have stuff from pesticides, so it's good to wash them or choose organic ones.\n" +
                        "\n" +
                        "They Have Natural Sugar: Apples have natural sugar, so too many might not be great, especially if you need to watch your sugar levels.\n" +
                        "\n" +
                        "Nutritional Info (For a Medium Apple):\n" +
                        "\n" +
                        "Proteins: Apples don't have much protein, almost like a tiny sprinkle of it.\n" +
                        "\n" +
                        "Vitamin C: They have a bit of vitamin C, which helps you stay strong and not get sick.\n" +
                        "\n" +
                        "Fiber: Apples have some fiber, which helps your tummy feel good and keeps things moving smoothly.\n" +
                        "\n" +
                        "Calories: Apples don't have many calories, which is good if you don't want to eat too much."
            )
        )
        fruits.add(
            FruitData(
                "Banana",
                "Yellow",
                R.drawable.banana_,
                "Advantages of Bananas:\n" +
                        "\n" +
                        "Good for Your Heart: Bananas have stuff called potassium that helps keep your heart healthy.\n" +
                        "\n" +
                        "Energy Boost: Bananas have natural sugars that give you quick energy when you eat them.\n" +
                        "\n" +
                        "Help with Your Tummy: They have fiber that makes your tummy feel good and helps you go to the bathroom regularly.\n" +
                        "\n" +
                        "Disadvantages of Bananas:\n" +
                        "\n" +
                        "Sugar Stuff: Bananas have natural sugars, so too many might not be great for you, especially if you need to watch your sugar levels.\n" +
                        "\n" +
                        "Might Make You Feel Blocked Up: Sometimes, eating lots of bananas might make it hard to go to the bathroom.\n" +
                        "\n" +
                        "Nutritional Info (For a Medium Banana):\n" +
                        "\n" +
                        "Proteins: Bananas don’t have much protein – just a little bit.\n" +
                        "\n" +
                        "Potassium: They have a lot of potassium, which is good for your body and helps your muscles work well.\n" +
                        "\n" +
                        "Vitamin B6: Bananas have a bit of this vitamin that helps your body stay healthy.\n" +
                        "\n" +
                        "Fiber: They have some fiber, which is good for your tummy and helps you feel full.\n" +
                        "\n" +
                        "Calories: Bananas don’t have many calories, which is good if you're watching how much you eat."
            )
        )
        fruits.add(
            FruitData(
                "mango",
                "Bright Yellow",
                R.drawable.mango_,
                "Advantages of Mangoes:\n" +
                        "\n" +
                        "Good for Your Immune System: Mangoes have vitamins that help keep you healthy and protect your body from getting sick.\n" +
                        "\n" +
                        "They're Full of Good Stuff: Mangoes have things called antioxidants that help keep your cells safe from damage.\n" +
                        "\n" +
                        "They Help Your Tummy: Mangoes have stuff called fiber that helps your tummy work well and keeps you feeling good inside.\n" +
                        "\n" +
                        "Disadvantages of Mangoes:\n" +
                        "\n" +
                        "They're Sweet: Mangoes have natural sugar, so too many might not be good, especially if you need to watch your sugar levels.\n" +
                        "\n" +
                        "Some People Might Get Rashes: A few people might get itchy or get rashes after eating mangoes if they're allergic.\n" +
                        "\n" +
                        "Nutritional Info (For a Medium Mango):\n" +
                        "\n" +
                        "Proteins: Mangoes don’t have much protein – just a tiny bit.\n" +
                        "\n" +
                        "Vitamin C: They have a good amount of vitamin C, which keeps you strong and healthy.\n" +
                        "\n" +
                        "Fiber: Mangoes have some fiber, which helps your tummy feel good.\n" +
                        "\n" +
                        "Calories: Mangoes have a bit more calories, but they're still a healthy snack."
            )
        )
        fruits.add(
            FruitData(
                "Pineapple",
                "Yellow",
                R.drawable.pinapple_,
                "Advantages of Pineapples:\n" +
                        "\n" +
                        "Help Your Body Stay Strong: Pineapples have lots of vitamin C that keeps you healthy and helps your skin look good.\n" +
                        "\n" +
                        "They're Good for Digestion: Pineapples have something called bromelain that helps your tummy work well and may help with breathing problems.\n" +
                        "\n" +
                        "Protect Your Cells: Pineapples have things called antioxidants that keep your body's cells safe from damage.\n" +
                        "\n" +
                        "Disadvantages of Pineapples:\n" +
                        "\n" +
                        "They Might Make You Feel Funny: Pineapples have high acidity, so some people might feel uncomfortable in their tummy after eating too much.\n" +
                        "\n" +
                        "Allergic Reactions: A few people might have allergies to pineapples and get itchy or swollen after eating them.\n" +
                        "\n" +
                        "Nutritional Info (For a Cup of Pineapple Chunks):\n" +
                        "\n" +
                        "Proteins: Pineapples don’t have much protein – just a tiny bit.\n" +
                        "\n" +
                        "Vitamin C: They have lots of vitamin C, which keeps you strong and healthy.\n" +
                        "\n" +
                        "Fiber: Pineapples have some fiber, which helps your tummy feel good.\n" +
                        "\n" +
                        "Calories: Pineapples don’t have many calories, which is good if you're watching your weight."
            )
        )
        fruits.add(
            FruitData(
                "Strawberry",
                "Red",
                R.drawable.strawberry_,
                "Advantages of Strawberries:\n" +
                        "\n" +
                        "Help Keep You Healthy: Strawberries have lots of vitamin C that helps your body stay strong and fight off sickness.\n" +
                        "\n" +
                        "They're Full of Good Stuff: Strawberries have things called antioxidants that keep your body's cells safe from damage.\n" +
                        "\n" +
                        "Help Your Tummy: Strawberries have fiber that helps your tummy feel good and helps you feel full.\n" +
                        "\n" +
                        "Disadvantages of Strawberries:\n" +
                        "\n" +
                        "They Might Have Pesticides: Sometimes, the outside of strawberries might have stuff from pesticides, so it's good to wash them or choose organic ones.\n" +
                        "\n" +
                        "Some People Might Be Allergic: A few people might have allergies to strawberries and get itchy or swollen after eating them.\n" +
                        "\n" +
                        "Nutritional Info (For a Cup of Sliced Strawberries):\n" +
                        "\n" +
                        "Proteins: Strawberries don’t have much protein – just a little bit.\n" +
                        "\n" +
                        "Vitamin C: They have a lot of vitamin C, which keeps you strong and healthy.\n" +
                        "\n" +
                        "Fiber: Strawberries have some fiber, which helps your tummy feel good and helps you feel full.\n" +
                        "\n" +
                        "Calories: Strawberries don’t have many calories, which is good if you're watching your weight."
            )
        )
        return fruits


    }
}
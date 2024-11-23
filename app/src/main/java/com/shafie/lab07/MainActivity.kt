package com.shafie.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shafie.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.scheduleBtn.setOnClickListener {
            //TODO:: Open a new page activity
            //Dari mana (this)
            //Ke mana (DetailActivity)

            val intent = Intent(this, DetailActivity::class.java)

            //hantar nilai nameEditText.text.toString ke DetailActivity menggunakan key "name"

            intent.putExtra("name",binding.nameEditText.text.toString())
            intent.putExtra("address",binding.addressEditText.text.toString())
            intent.putExtra("city",binding.cityEditText.text.toString())
            intent.putExtra("province",binding.provinceEditText.text.toString())
            intent.putExtra("postcode",binding.postcodeEditText.text.toString())
            intent.putExtra("country",binding.countryEditText.text.toString())

            //Open the page,execute the intent
            startActivity(intent)
        }

    }
}
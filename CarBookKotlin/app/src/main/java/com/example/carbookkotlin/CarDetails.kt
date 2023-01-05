package com.example.carbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carbookkotlin.databinding.ActivityCarDetailsBinding

class CarDetails : AppCompatActivity() {
    private lateinit var binding : ActivityCarDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent = intent
        //Casting

        val selectedCar = intent.getSerializableExtra("car") as Cars

        binding.nameText.text = selectedCar.name
        binding.infoText.text = selectedCar.info
        binding.imageView.setImageResource(selectedCar.image)
    }
}
package com.example.myscheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myscheduler.databinding.ActivityCharacterBinding

class CharacterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharacterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SuchedulerButton.setOnClickListener{finish()}


    }




}
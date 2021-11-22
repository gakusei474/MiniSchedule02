package com.example.myscheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myscheduler.databinding.ActivityCharacterBinding

class CharacterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharacterBinding
    private lateinit var name: NameFragment
    private lateinit var chara: CharacterFragment
    private lateinit var chara1: CharacterFragment2
    private lateinit var kisekae: KisekaeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        //ViewBinding
        binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Characterの名前
        name = NameFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nameFreme, name)
            commit()
        }


        //Characterの画像
        chara = CharacterFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.characterFreme, chara)
            addToBackStack(null)
            commit()
        }

        /*//備忘録　ボタンタップでCharacter画像（フラグメント）変更
        chara1 = CharacterFragment2()
        binding.KisekaeButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.characterFreme, chara1)
                addToBackStack(null)
                commit()
            }
        }*/


        kisekae = KisekaeFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.kisekaeFreme, kisekae)
            addToBackStack(null)
            commit()
        }


        //戻るボタンの処理
        binding.SuchedulerButton.setOnClickListener{finish()}


    }






}
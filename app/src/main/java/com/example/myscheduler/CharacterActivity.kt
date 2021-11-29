package com.example.myscheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myscheduler.databinding.ActivityCharacterBinding

class CharacterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharacterBinding
    private lateinit var kisekae: KisekaeFragment
    private lateinit var charamain: CharacterFragment2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        //ViewBinding
        binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)



        /*
        //備忘録　Characterの名前
        name = NameFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nameFreme, name)
            commit()
        }
    */

        //CharacterMain（画像、名前）
        charamain = CharacterFragment2()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.characterFrame, charamain)
            addToBackStack(null)
            commit()
        }


        //ボタンタップでCharacter画像（フラグメント）変更
        kisekae = KisekaeFragment()
        binding.kisekaeButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.characterFrame, kisekae)
                addToBackStack(null)
                commit()
            }
        }

        binding.kaiwaButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.characterFrame, charamain)
                addToBackStack(null)
                commit()
            }
        }



        //戻るボタンの処理
        binding.SuchedulerButton.setOnClickListener{finish()}


    }






}
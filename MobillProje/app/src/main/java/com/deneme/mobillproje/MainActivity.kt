package com.deneme.mobillproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var change_password: Button = findViewById(R.id.ChangePassword)

        change_password.setOnClickListener {
            var intent = Intent(this, ChangePasswordActivity::class.java)
            startActivity(intent)

        }

      var four_cards_button: Button = findViewById(R.id.FourCardGame)

        four_cards_button.setOnClickListener {

           var intent=Intent(this,FourCardsActivity::class.java)
           startActivity(intent)

        }

        var sixteen_cards_button: Button=findViewById(R.id.SixteenCardGame)

        sixteen_cards_button.setOnClickListener {

         var intent=Intent(this,SixteenCardsActivity::class.java)
         startActivity(intent)

        }

        var thirty_six_cards_button: Button=findViewById(R.id.ThirtySixCardGame)

        thirty_six_cards_button.setOnClickListener {

            var intent=Intent(this,ThirtySixCardsActivity::class.java)
            startActivity(intent)

        }

        var four_cards_multi_button: Button=findViewById(R.id.FourCardGameMulti)

        four_cards_multi_button.setOnClickListener {

            var intent=Intent(this,FourCardsMultiPlayerActivity::class.java)
            startActivity(intent)

        }

        var sixteen_cards_multi_button: Button=findViewById(R.id.SixteenCardGameMulti)

        sixteen_cards_multi_button.setOnClickListener {

            var intent=Intent(this,SixteenCardsMultiPlayerActivity::class.java)
            startActivity(intent)

        }

        var thirt_six_cards_multi_button :Button=findViewById(R.id.ThirtySixCardGameMulti)
        thirt_six_cards_multi_button.setOnClickListener {

            var intent=Intent(this,ThirtySixCardsMultiPlayerActivity::class.java)
            startActivity(intent)

        }





    }
}
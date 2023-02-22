package com.deneme.mobillproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_change_password.*

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        auth= Firebase.auth

        var update_password_button: Button =findViewById(R.id.SignUpButton)

        update_password_button.setOnClickListener {

            ChangePasswordMethod()

        }


    }

    private fun ChangePasswordMethod() {



        var password=findViewById<EditText>(R.id.EditTextChangePassword)

        if(password.text.isEmpty()){

            Toast.makeText(this,"Lütfen Yeni Şifrenizi Giriniz ",Toast.LENGTH_LONG).show()
            return

        }

        var user=auth.currentUser
        var inputPassword=password.text.toString()
        if(user!=null){

            user.updatePassword(inputPassword).addOnCompleteListener {

                if (it.isSuccessful) {

                    Toast.makeText(this,"Şifreniz Değiştirildi",Toast.LENGTH_LONG).show()

                    var intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)


                }
                else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(baseContext, "Şifreniz Değiştirilemedi",
                        Toast.LENGTH_LONG).show()

                }
            }
                .addOnFailureListener {

                    Toast.makeText(this,"Hata oluştu ${it.localizedMessage}",Toast.LENGTH_LONG).show()

                }




        }





    }
}
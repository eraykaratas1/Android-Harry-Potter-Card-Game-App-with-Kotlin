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

class SignUpActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Initialize Firebase Auth
        auth = Firebase.auth


        var login_button: Button = findViewById(R.id.SignUpLoginButton)

        login_button.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
        var signup_button: Button=findViewById(R.id.SignUpButton)

        signup_button.setOnClickListener {

            SignUpMethod()

        }

    }

    private fun SignUpMethod() {

        var email=findViewById<EditText>(R.id.EditTextSignUpName)
        var password=findViewById<EditText>(R.id.EditTextSignUpPassword)

        if(email.text.isEmpty()){

          Toast.makeText(this,"Lütfen Kullanıcı Adınızı Giriniz ",Toast.LENGTH_LONG).show()
            return

        }
        else if(password.text.isEmpty()){

          Toast.makeText(this,"Lütfen Şifrenizi Giriniz",Toast.LENGTH_LONG).show()
          return

        }

        var inputE=email.text.toString()
        var inputP=password.text.toString()

        auth.createUserWithEmailAndPassword(inputE,inputP)

            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                    var intent=Intent(this,MainActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(baseContext, "Kullanıcı Başarıyla Kaydoldu",
                        Toast.LENGTH_LONG).show()


                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(baseContext, "Kullanıcı Doğrulama Yapılamadı",
                        Toast.LENGTH_LONG).show()

                }
            }
            .addOnFailureListener {

              Toast.makeText(this,"Hata oluştu ${it.localizedMessage}",Toast.LENGTH_LONG).show()

            }


    }


}
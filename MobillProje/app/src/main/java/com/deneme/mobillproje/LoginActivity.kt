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

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth=Firebase.auth

        var signup_button: Button = findViewById(R.id.LoginSignUpButton)

        signup_button.setOnClickListener {
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }

       var login_button:Button=findViewById(R.id.LoginButton)

     login_button.setOnClickListener {

      LoginMethod()

     }




    }

    private fun LoginMethod() {

        var email: EditText=findViewById(R.id.EditTextLoginName)
        var password: EditText=findViewById(R.id.EditTextLoginPassword)

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

        auth.signInWithEmailAndPassword(inputE,inputP)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                    var intent=Intent(this,MainActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(baseContext, "Kullanıcı Girişi Başarılı",
                        Toast.LENGTH_LONG).show()

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(baseContext, "Şifre veya Email Hatalı.",
                        Toast.LENGTH_SHORT).show()

                }
            }
            .addOnFailureListener {
                Toast.makeText(baseContext, "Kullanıcı Doğrulama Yapılamadı ${it.localizedMessage}",
                    Toast.LENGTH_SHORT).show()

            }





    }
}
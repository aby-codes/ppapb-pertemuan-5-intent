package com.example.pertemuan_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuan_5.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {


    private lateinit var binding: ActivityRegistrationBinding

    companion object {
        const val it_USERNAME = "username"
        const val it_EMAIL = "email"
        const val it_PHONE = "phone"
        const val it_PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            registerButton.setOnClickListener{

                val intent = Intent(this@RegistrationActivity,HomepageActivity::class.java)

                val username = username.text.toString()
                val email = email.text.toString()
                val phone = phoneNumber.text.toString()
                val password = password.text.toString()

                if (username == "" || email == "" || phone == "" || password == ""){
                    Toast.makeText(applicationContext, "Cant Empty!", Toast.LENGTH_SHORT).show()
                }else  {
                    intent.putExtra(it_USERNAME, username)
                    intent.putExtra(it_EMAIL, email)
                    intent.putExtra(it_PHONE, phone)
                    intent.putExtra(it_PASSWORD, password)
                    startActivity(intent)
                }

            }
        }
    }
}
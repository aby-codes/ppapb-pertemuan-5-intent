package com.example.pertemuan_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan_5.databinding.ActivityHomepageBinding

class HomepageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(RegistrationActivity.it_USERNAME)
        val email = intent.getStringExtra(RegistrationActivity.it_EMAIL)
        val phone = intent.getStringExtra(RegistrationActivity.it_PHONE)

        with(binding){

            tvUsername.text = "$username"
            tvEmail.text = "$email"
            tvPhone.text = "$phone"

            logoutButton.setOnClickListener{
                finish()
            }

        }

    }
}
package com.cenga.movieapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showUser()
    }
    private fun showUser(){
        val preferences = getSharedPreferences("MovieApp",Context.MODE_PRIVATE)
        val email= preferences.getString("email","User Not Found")
        Toast.makeText(this, "email: $email", Toast.LENGTH_LONG).show()

    }
}

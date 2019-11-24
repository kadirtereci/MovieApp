package com.cenga.movieapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.util.Log
import android.widget.Toast
import androidx.core.content.contentValuesOf
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           button2.setOnClickListener{

           initUi()


       }
    }
        private fun initUi() {
            button2.setOnClickListener {

                val email: String = mailtext.text.toString()

                val password: String = password1.text.toString()

                saveUser(email, password)
                navigateDetailActivity()
            }
        }
    private fun navigateDetailActivity (){

        val detailIntent = Intent(this,MovieDetailActivity::class.java)
        startActivity(detailIntent)
    }

    private fun saveUser(email: String, password:String){

    val preferences = getSharedPreferences("MovieApp", Context.MODE_PRIVATE)
    val editor = preferences.edit()
        editor.putString("email", email)
        editor.putString("password" ,password)
        editor.apply()

        val savedEmail= preferences.getString("email","default text")

        Toast.makeText(this,"email: $email Password $password",Toast.LENGTH_LONG).show()

        Log.d("buttonclick","email: $email, password : $password")




    }
    }


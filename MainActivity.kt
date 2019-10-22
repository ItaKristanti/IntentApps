package com.example.intentapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val id :Int = 10
    private val language : String= "Kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pindah.setOnClickListener(){
            //variabel intent
            val intent = Intent(this, ActivityBaru::class.java)

            intent.putExtra("id_key", id)
            intent.putExtra("language_key", language)

            startActivity(intent)
        }

    }
}

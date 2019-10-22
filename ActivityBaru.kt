package com.example.intentapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_baru.*

class ActivityBaru : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru)
        //caranya tidak langsung harus buat variabel data terlebih dahulu
        //variabel digunakan untuk mengambil semua data di intent
        //tanda ? digunakan pengecekan saja, null atau tidak
        //extra untuk izin mengambil data
        //val data : Bundle? = intent.extras
        //language.text = data?.get("language_key").toString()
       // id.text = data?.get("id_key").toString()


        //langsung mengakses ke intent
        language.text = intent.
            getStringExtra("language_key")
        id.text = intent.
            getIntExtra("id_key", 0).
            toString()

        back.setOnClickListener(){
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        Toast.makeText(this, "hallo", Toast.LENGTH_SHORT).show()

        super.onBackPressed()
    }
}

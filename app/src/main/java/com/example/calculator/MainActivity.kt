package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLomie: Button = findViewById(R.id.btn_lomie)
        btnLomie.setOnClickListener(this)
    }
    override fun onClick(v: View?)
    {
        when (v?.id)
        {
            R.id.btn_lomie ->
            {
                val moveIntent = Intent(this@MainActivity, LomieActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
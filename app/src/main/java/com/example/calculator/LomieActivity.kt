package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class LomieActivity : AppCompatActivity(), View.OnClickListener
{
    private lateinit var etLomieL: EditText
    private lateinit var etLomieS: EditText
    private lateinit var etDryNoodleL: EditText
    private lateinit var etDryNoodleS: EditText
    private lateinit var etWontonNoodleL: EditText
    private lateinit var etWontonNoodleS: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lomie)
        etLomieL = findViewById(R.id.et_lomie_l)
        etLomieS = findViewById(R.id.et_lomie_s)
        etDryNoodleL = findViewById(R.id.et_dry_noodle_l)
        etDryNoodleS = findViewById(R.id.et_dry_noodle_s)
        etWontonNoodleL = findViewById(R.id.et_wonton_noodle_l)
        etWontonNoodleS = findViewById(R.id.et_wonton_noodle_s)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate.setOnClickListener(this)
    }
    override fun onClick(v: View?)
    {
        if (v?.id == R.id.btn_calculate)
        {
            val inputLomieL = etLomieL.text.toString().trim()
            val inputLomieS = etLomieS.text.toString().trim()
            val inputDryNoodleL = etDryNoodleL.text.toString().trim()
            val inputDryNoodleS = etDryNoodleS.text.toString().trim()
            val inputWontonNoodleL = etWontonNoodleL.text.toString().trim()
            val inputWontonNoodleS = etWontonNoodleS.text.toString().trim()
            var isEmptyFields = false
            if (inputLomieL.isEmpty())
            {
                isEmptyFields = true
                etLomieL.error = "Field ini harus diisi"
            }
            if (inputLomieS.isEmpty())
            {
                isEmptyFields = true
                etLomieS.error = "Field ini harus diisi"
            }
            if (inputDryNoodleL.isEmpty())
            {
                isEmptyFields = true
                etDryNoodleL.error = "Field ini harus diisi"
            }
            if (inputDryNoodleS.isEmpty())
            {
                isEmptyFields = true
                etDryNoodleS.error = "Field ini harus diisi"
            }
            if (inputWontonNoodleL.isEmpty())
            {
                isEmptyFields = true
                etWontonNoodleL.error = "Field ini harus diisi"
            }
            if (inputWontonNoodleS.isEmpty())
            {
                isEmptyFields = true
                etWontonNoodleS.error = "Field ini harus diisi"
            }
            if (!isEmptyFields)
            {
                val total = inputLomieL.toInt() * 40000 + inputLomieS.toInt() * 35000 + inputDryNoodleL.toInt() * 20000 + inputDryNoodleS.toInt() * 15000 + inputWontonNoodleL.toInt() * 30000 + inputWontonNoodleS.toInt() * 25000
                val tax = (0.1 * total).roundToInt()
                val gt = total + tax
                tvResult.text = gt.toString()
            }
        }
    }
}
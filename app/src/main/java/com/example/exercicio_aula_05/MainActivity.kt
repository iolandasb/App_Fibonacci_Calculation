package com.example.exercicio_aula_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var campo: EditText
    lateinit var calcular: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo = findViewById(R.id.edtCampo)
        calcular = findViewById(R.id.btnCalcular)
        resultado = findViewById(R.id.txtResultado)

        calcular.setOnClickListener {

            var n = campo.text.toString().toInt()-1
            var t1: Long = 0 //O "long" evita os números negativos após a posição 47.
            var t2: Long = 1 //O "long" evita os números negativos após a posição 47.
            var cleber = " $t2"

            if(n >= 0) {

                for (i in 1..n) {
                    val sum = t1 + t2
                    t1 = t2
                    t2 = sum
                    cleber += " $t2"
                }
                    resultado.text = "$cleber"
                } else {
                    resultado.text = "Digite um número válido!"
                }

        }

    }
}
package br.com.projetocomintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto: EditText = findViewById(R.id.texto)
        val botao: Button = findViewById(R.id.button)

        botao.setOnClickListener{
            val intent = Intent(applicationContext, Tela2Activity::class.java)
            val params = Bundle()
            val textoDigitado = texto.text.toString()
            params.putString("texto", textoDigitado)
            intent.putExtras(params)
            startActivity(intent)
        }
    }
}
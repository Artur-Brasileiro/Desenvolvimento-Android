package br.com.projetocomintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val texto: TextView = findViewById(R.id.textView)

        val textoRecuperado = intent.getStringExtra("texto")
        texto.text = textoRecuperado

    }
}
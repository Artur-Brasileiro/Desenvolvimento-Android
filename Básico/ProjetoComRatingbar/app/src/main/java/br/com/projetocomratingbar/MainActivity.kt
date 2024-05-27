package br.com.projetocomratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var barra: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorSelecionado)
        barra = findViewById(R.id.barraDeValor)

        barra.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            texto.text = rating.toString()
        }
    }
}
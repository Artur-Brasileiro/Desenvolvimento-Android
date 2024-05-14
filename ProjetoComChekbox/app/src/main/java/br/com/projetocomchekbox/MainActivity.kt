package br.com.projetocomchekbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var chekBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.marcadoDesmarcado)
        chekBox = findViewById(R.id.checkBox)

        chekBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                texto.text = "Está marcado!"
            } else {
                texto.text = "Está desmarcado!"
            }
        }
    }
}
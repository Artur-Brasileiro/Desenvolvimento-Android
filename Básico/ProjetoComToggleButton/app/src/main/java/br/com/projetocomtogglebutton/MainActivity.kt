package br.com.projetocomtogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var interruptor: ToggleButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)
        interruptor = findViewById(R.id.toggleButton)

        interruptor.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                texto.text = "O botão está ativado!"
            } else {
                texto.text = "O botão está desativado!"
            }
        }

        interruptor.setOnClickListener {
            if (interruptor.isChecked) {
                Toast.makeText(applicationContext, "O botão está ativado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "O botão está desativado!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
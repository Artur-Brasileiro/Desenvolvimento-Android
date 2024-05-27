package br.com.projetocomspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var spiner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)
        spiner = findViewById(R.id.spinner)
        val estados = arrayOf("Paraná", "Goiás", "São Paulo", "Rio de Janeiro", "Minas Gerais")
        spiner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, estados)

        spiner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                texto.text = estados[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}
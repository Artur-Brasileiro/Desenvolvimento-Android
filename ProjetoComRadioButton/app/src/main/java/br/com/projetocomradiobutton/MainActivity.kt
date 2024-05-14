package br.com.projetocomradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var botao: Button
    lateinit var grupo: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.button)
        grupo = findViewById(R.id.radioGroup)

        botao.setOnClickListener {
            if (grupo.checkedRadioButtonId != null) {
                var radioSelecionado: RadioButton
                radioSelecionado = findViewById(grupo.checkedRadioButtonId)
                Toast.makeText(applicationContext, "Radio selecionado: ${radioSelecionado.text}", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Nenhum opção selecionada!", Toast.LENGTH_SHORT).show()
            }
        }

        grupo.setOnCheckedChangeListener { group, checkedId ->
            var radioSelecionado: RadioButton
            radioSelecionado = findViewById(grupo.checkedRadioButtonId)
            Toast.makeText(applicationContext, "Radio selecionado: ${radioSelecionado.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
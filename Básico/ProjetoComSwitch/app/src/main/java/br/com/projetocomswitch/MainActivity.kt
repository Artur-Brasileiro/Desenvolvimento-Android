package br.com.projetocomswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val swtc = findViewById(R.id.switchTeste) as Switch

        swtc.setOnClickListener {
            if (swtc.isChecked) {
                Toast.makeText(applicationContext, "O botão está ligado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "O botão está desligado!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
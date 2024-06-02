package br.com.callbacksandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var botao : Button
    private lateinit var texto : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        botao = findViewById(R.id.botao)
        texto = findViewById(R.id.texto)

        botao.setOnClickListener {
            fetchData {
                texto.text = it
            }
        }
    }

    private fun fetchData(callback: (String) -> Unit) {
        Thread(Runnable {
            Thread.sleep(3000)
            val data = "Dados recebidos"
            runOnUiThread {
                callback.invoke(data)
            }
        }).start()
    }
}
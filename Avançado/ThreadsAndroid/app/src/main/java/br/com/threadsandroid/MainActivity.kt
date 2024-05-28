package br.com.threadsandroid

import android.os.AsyncTask
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.UiThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    private lateinit var start1: Button
    private lateinit var start2: Button
    private lateinit var timer1: TextView
    private lateinit var timer2: TextView
    private lateinit var reset: Button

    private var texto1: Double = 0.0
    private var texto2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        start1 = findViewById(R.id.star1)
        start2 = findViewById(R.id.star2)
        timer1 = findViewById(R.id.timer1)
        timer2 = findViewById(R.id.timer2)
        reset = findViewById(R.id.reset)

        timer1.text = texto1.toString()
        timer2.text = texto2.toString()

        start1.setOnClickListener {
            lifecycleScope.launch {
                incrementaApos1000Milis()
            }

        }

        start2.setOnClickListener {
            lifecycleScope.launch {
                incrementaApos5000Milis()
            }
        }

        reset.setOnClickListener {
            texto1 = 0.0
            texto2 = 0.0
            updateTimers()
        }
    }

    private suspend fun incrementaApos1000Milis() {
        delay(1000)
        texto1 += 1.0
        updateTimers()
    }

    private suspend fun incrementaApos5000Milis() {
        delay(5000)
        texto2 += 5.0
        updateTimers()
    }

    fun updateTimers() {
        timer1.text = texto1.toString()
        timer2.text = texto2.toString()
    }
}
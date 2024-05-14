package br.com.projetocomseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var seekBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorAtual)
        seekBar = findViewById(R.id.seekBar)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                texto.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar1: SeekBar?) {
                Toast.makeText(applicationContext, "Começou em: " + seekBar.progress, Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar1: SeekBar?) {
                Toast.makeText(applicationContext, "Terminou em: " + seekBar.progress, Toast.LENGTH_SHORT).show()
            }

        })
    }
}
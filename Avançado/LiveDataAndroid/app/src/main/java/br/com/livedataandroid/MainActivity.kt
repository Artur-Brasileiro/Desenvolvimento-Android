package br.com.livedataandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.livedataandroid.viewModel.ContadorViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel : ContadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupObservers()
        setupClick()
    }

    private fun setupObservers() {
        viewModel.contador.observe(this) {contador ->
            findViewById<TextView>(R.id.text_view_value).text =
                "O valor do contador é $contador"
        }
    }

    private fun setupClick() {
        findViewById<Button>(R.id.button_sum).setOnClickListener {
            viewModel.addOne()
        }
    }
}
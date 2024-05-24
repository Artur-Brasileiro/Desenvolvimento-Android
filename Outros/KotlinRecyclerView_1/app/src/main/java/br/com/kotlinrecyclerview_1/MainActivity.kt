package br.com.kotlinrecyclerview_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val items = listOf(
            Item("Título 1", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 2", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 3", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 4", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 5", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 6", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 7", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 8", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 9", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 10", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 11", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 12", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 13", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 14", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 15", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 16", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 17", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 18", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 19", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 20", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado."),
            Item("Título 21", "Com essas mudanças, os TextViews devem estar alinhados à esquerda dentro do ConstraintLayout. Certifique-se de testar e ajustar conforme necessário para obter o layout desejado.")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(items)
    }
}
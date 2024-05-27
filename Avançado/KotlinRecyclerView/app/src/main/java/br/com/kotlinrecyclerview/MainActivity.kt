package br.com.kotlinrecyclerview

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

        val produtos = listOf(
            Produto(
                "Milkshake",
                "Feito com leite de boi.",
                "R$25"
            ),
            Produto(
                "Carne",
                "Picanha do Lule",
                "R$160"
            ),
            Produto(
                "Macarrão",
                "Macarrão espaguete tipo 8.",
                "R$12"
            ),
            Produto(
                "Chocolate",
                "Produzido na Bahia.",
                "R$25"
            ),
            Produto(
                "Alface",
                "Produção familiar.",
                "R$8"
            ),
            Produto(
                "Melão",
                "Colhido todas manhãs.",
                "R$15"
            ),
            Produto(
                "Arroz",
                "Produzido na fazenda Raio de Sol.",
                "R$45 faz o L"
            )

        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProdutoAdapter(produtos)
    }
}
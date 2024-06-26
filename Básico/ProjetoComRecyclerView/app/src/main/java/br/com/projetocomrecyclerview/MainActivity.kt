package br.com.projetocomrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jogos = ArrayList<Jogo>()
        jogos.add(Jogo("Halo", "Xbox"))
        jogos.add(Jogo("God Of War", "Playstation"))
        jogos.add(Jogo("Pokemon", "Nintendo"))
        val adapter = JogoAdapter(applicationContext, jogos)

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.itemAnimator = DefaultItemAnimator()
        recycler.adapter = adapter
    }
}
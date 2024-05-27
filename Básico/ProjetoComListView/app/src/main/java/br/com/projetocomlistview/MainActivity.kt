package br.com.projetocomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById<ListView>(R.id.lista)

        var jogos = ArrayList<Jogo>()
        jogos.add(Jogo("God Of War", "Playstation 5"))
        jogos.add(Jogo("The Last Of Us", "Playstation 5"))
        jogos.add(Jogo("Spider-Man 2", "Playstation 5"))
        jogos.add(Jogo("Zelda: Tears Of The Kingdon", "Nintendo"))
        jogos.add(Jogo("Baldurs Gate 3", "Xbox"))
        jogos.add(Jogo("Hogwarts Legacy", "Playstation 5"))

        var adapter : ListaAdapter = ListaAdapter(applicationContext, jogos)
        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, "Jogo: ${jogos.get(position).nome}", Toast.LENGTH_SHORT).show()
        }
    }
}
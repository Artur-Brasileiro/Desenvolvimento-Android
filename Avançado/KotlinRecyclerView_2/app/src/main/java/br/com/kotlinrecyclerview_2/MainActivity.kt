package br.com.kotlinrecyclerview_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.kotlinrecyclerview_2.model.Pessoa

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

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val items = listOf<Pessoa>(
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", ""),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", ""),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", ""),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", ""),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", ""),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", ""),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", ""),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", ""),
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", ""),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", ""),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", ""),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", ""),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", ""),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", ""),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", ""),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", ""),
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", ""),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", ""),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", ""),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", ""),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", ""),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", ""),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", ""),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", ""),
            Pessoa("Artur Morais Brasileiro", "000.000.000-00", "21/04/2004", ""),
            Pessoa("Enzo Morais Brasileiro", "000.000.000-00", "30/08/2012", ""),
            Pessoa("Fulano Augusto Medeiros", "000.000.000-00", "27/03/2000", ""),
            Pessoa("Victor Hugo de Alencar Moraes", "000.000.000-00", "19/09/1996", ""),
            Pessoa("Daniel Lima Goncalves", "000.000.000-00", "05/01/2002", ""),
            Pessoa("Pedro de Souza Cruz", "000.000.000-00", "10/05/1975", ""),
            Pessoa("Thalys Jacinto Pinto", "000.000.000-00", "20/02/2009", ""),
            Pessoa("Ciclano de Nao Sei o Que", "000.000.000-00", "14/07/1993", "")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PessoaAdapter(items)
    }
}
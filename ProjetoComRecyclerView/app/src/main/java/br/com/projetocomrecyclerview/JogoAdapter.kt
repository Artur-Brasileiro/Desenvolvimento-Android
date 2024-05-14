package br.com.projetocomrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class JogoAdapter (val contexto: Context, val itens: ArrayList<Jogo>) : RecyclerView.Adapter<JogoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.linha_de_jogo, parent, false)
        val holder = JogoViewHolder(view)
        return holder

    }

    override fun getItemCount(): Int {

        return itens.size

    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {

        val jogo = itens.get(position)
        holder.nome.text = jogo.nome
        holder.plataforma.text = jogo.plataforma
        holder.nome.setOnClickListener{
            Toast.makeText(contexto, "Clicou em: ${jogo.nome}", Toast.LENGTH_SHORT).show()
        }

    }

}
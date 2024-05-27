package br.com.kotlinrecyclerview_2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PessoaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textoNome = itemView.findViewById<TextView>(R.id.nome)
    val textoNascimento = itemView.findViewById<TextView>(R.id.nascimento)
    val textoCpf = itemView.findViewById<TextView>(R.id.cpf)
}
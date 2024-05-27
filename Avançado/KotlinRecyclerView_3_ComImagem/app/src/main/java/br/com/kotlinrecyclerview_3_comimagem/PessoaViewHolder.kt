package br.com.kotlinrecyclerview_3_comimagem

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PessoaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imgFoto = itemView.findViewById<ImageView>(R.id.foto)
    val txtNome = itemView.findViewById<TextView>(R.id.nome)
    val txtNascimento = itemView.findViewById<TextView>(R.id.nascimento)
    val txtCpf = itemView.findViewById<TextView>(R.id.cpf)
}
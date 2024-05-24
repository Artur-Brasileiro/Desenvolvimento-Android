package br.com.kotlinrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textoTitulo = itemView.findViewById<TextView>(R.id.produtoTitulo)
    val textoValor = itemView.findViewById<TextView>(R.id.produtoValor)
    val textoDescricao = itemView.findViewById<TextView>(R.id.produtoDescricao)
}
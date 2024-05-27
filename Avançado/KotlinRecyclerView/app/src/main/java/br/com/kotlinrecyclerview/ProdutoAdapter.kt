package br.com.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProdutoAdapter(private val items: List<Produto>) : RecyclerView.Adapter<ProdutoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_produto, parent, false)
        return ProdutoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val item = items[position]
        holder.textoTitulo.text = item.titulo
        holder.textoValor.text = item.valor
        holder.textoDescricao.text = item.descricao
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
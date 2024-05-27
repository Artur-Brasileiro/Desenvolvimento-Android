package br.com.kotlinrecyclerview_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.kotlinrecyclerview_2.model.Pessoa

class PessoaAdapter(private val items : List<Pessoa>) : RecyclerView.Adapter<PessoaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PessoaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pessoa_layout, parent, false)
        return PessoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PessoaViewHolder, position: Int) {
        val item = items[position]
        holder.textoNome.text = item.nome
        holder.textoNascimento.text = item.nascimento
        holder.textoCpf.text = item.cpf
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
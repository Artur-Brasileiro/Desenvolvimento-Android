package br.com.kotlinrecyclerview_3_comimagem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.kotlinrecyclerview_3_comimagem.model.Pessoa
import com.bumptech.glide.Glide

class PessoaAdapter(private val items: List<Pessoa>) : RecyclerView.Adapter<PessoaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PessoaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pessoa_layout, parent, false)
        return PessoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PessoaViewHolder, position: Int) {
        val item = items[position]
        holder.txtNome.text = item.nome
        holder.txtNascimento.text = item.nascimento
        holder.txtCpf.text = item.cpf

        Glide.with(holder.itemView.context)
            .load(item.foto)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.erro)
            .into(holder.imgFoto)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
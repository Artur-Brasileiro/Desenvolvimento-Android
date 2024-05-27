package br.com.kotlinrecyclerview_1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textTitle = itemView.findViewById<TextView>(R.id.item_title)
    val textDescription = itemView.findViewById<TextView>(R.id.item_description)
}
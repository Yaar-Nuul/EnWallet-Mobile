package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var itemList: List<WalletItems>):
    RecyclerView.Adapter<ContentViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.wallet_item, parent,false)
        return ContentViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val content = itemList[position]
        holder.tvName.text = content.itemName
        holder.tvDate.text = content.date

    }
    override fun getItemCount(): Int {
        return itemList.size
    }
}
class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName = itemView.findViewById<TextView>(R.id.textView)
    val tvDate = itemView.findViewById<TextView>(R.id.textView2)

}
package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var itemList: List<EnWallet>):
    RecyclerView.Adapter<ContentViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.income_item, parent,false)
        return ContentViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val enwallet = itemList[position]
        holder.ivExpense.setImageResource(enwallet.icons)
        holder.tvName.text = enwallet.itemName
        holder.tvAmount.text = enwallet.amount
        holder.tvDate.text = enwallet.date


    }
    override fun getItemCount(): Int {
        return itemList.size
    }
}
class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ivExpense = itemView.findViewById<ImageView>(R.id.ivExpense)
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)


}
package com.ej.defaultcamera_gallary_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ej.defaultcamera_gallary_test.databinding.ItemHorizontalBinding
import com.ej.defaultcamera_gallary_test.databinding.ItemListOneBinding

class ItemAdapter(var list: ArrayList<TransactionHistory>) : RecyclerView.Adapter<ItemAdapter.ItemAdapterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListOneBinding.inflate(inflater, parent,false)
        return ItemAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
    inner class ItemAdapterViewHolder(private val binding: ItemListOneBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(transactionHistory: TransactionHistory) {
            binding.transactionTypeText.text = transactionHistory.transactionType
            binding.transactionTimeText.text = transactionHistory.transactionTime
            binding.transactionAmountText.text = transactionHistory.transactionAmount
            binding.transactionLocationText.text = transactionHistory.transactionLocation

        }
    }
}
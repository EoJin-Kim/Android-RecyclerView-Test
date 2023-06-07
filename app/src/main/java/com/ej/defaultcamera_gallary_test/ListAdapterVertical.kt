package com.ej.defaultcamera_gallary_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ej.defaultcamera_gallary_test.databinding.ItemDateBinding
import com.ej.defaultcamera_gallary_test.databinding.ItemHorizontalBinding

class ListAdapterVertical(var list: ArrayList<TransactionDateHistory>) : RecyclerView.Adapter<ListAdapterVertical.ListVerticalAdapterViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListVerticalAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDateBinding.inflate(inflater, parent,false)
        return ListVerticalAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListVerticalAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        val size = list.size
        return size
    }

    inner class ListVerticalAdapterViewHolder(private val binding: ItemDateBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(transactionDateHistory : TransactionDateHistory) {
            binding.transactionDateText.text = transactionDateHistory.date

            val itemAdapter = ItemAdapter(transactionDateHistory.transactionHistoryList)
            binding.transactionRecycler.adapter = itemAdapter
        }
    }
}
package com.ej.defaultcamera_gallary_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ej.defaultcamera_gallary_test.databinding.ItemHorizontalBinding

class ListAdapterHorizontal(var list: ArrayList<String>):  RecyclerView.Adapter<ListAdapterHorizontal.ListHorizontalAdapterViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHorizontalAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHorizontalBinding.inflate(inflater, parent,false)
        return ListHorizontalAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListHorizontalAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
    inner class ListHorizontalAdapterViewHolder(private val binding: ItemHorizontalBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(coinType: String) {
            binding.coinType.text = coinType
        }
    }
}
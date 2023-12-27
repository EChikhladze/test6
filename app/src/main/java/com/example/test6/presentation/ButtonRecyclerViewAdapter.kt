package com.example.test6.presentation

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test6.databinding.ItemButtonBinding
import com.example.test6.databinding.ItemImageButtonBinding

class ButtonRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class NumberButtonViewHolder(private val binding: ItemButtonBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    inner class ImageButtonViewHolder(private val binding: ItemImageButtonBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    companion object {
        const val NUMBER_BUTTON_TYPE = 1
        const val IMAGE_BUTTON_TYPE = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}
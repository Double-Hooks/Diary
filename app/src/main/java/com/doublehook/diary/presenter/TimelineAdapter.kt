package com.doublehook.diary.presenter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.doublehook.diary.databinding.ListitemPostBinding
import com.doublehook.diary.model.Post

class TimelineAdapter(private val items: ArrayList<Post>) :
    RecyclerView.Adapter<TimelineAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ListitemPostBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(listener: View.OnClickListener, item: Post) {
            //
        }
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListitemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        val listener = View.OnClickListener {
            // TODO: do something
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }
}
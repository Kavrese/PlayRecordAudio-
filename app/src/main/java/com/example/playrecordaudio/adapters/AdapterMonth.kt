package com.example.playrecordaudio.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.playrecordaudio.R
import com.example.playrecordaudio.model.ModelMonth
import kotlinx.android.synthetic.main.item_rec_month.view.*

class AdapterMonth(var list: MutableList<ModelMonth>): RecyclerView.Adapter<AdapterMonth.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name_dialog)
        val count = itemView.findViewById<TextView>(R.id.count_file)
        val checkBox = itemView.findViewById<CheckBox>(R.id.checkBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rec_month, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = list[position].name_month
        holder.count.text = list[position].count.toString()
        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}
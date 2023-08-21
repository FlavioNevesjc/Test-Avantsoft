package com.example.avantsofttest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.avantsofttest.R
import com.example.avantsofttest.model.Users

// Templeate para realizar a "impressão" das informações do API.
class UsersAdapter (private val dataSet: List<Users>): RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {
    class UsersViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val tvNome: TextView = view.findViewById(R.id.tvName)
        val tvLabelEmail: TextView = view.findViewById(R.id.tv_label_email)
        val tvEmail: TextView = view.findViewById(R.id.tvEmail)
        val tvLabelAge: TextView = view.findViewById(R.id.tv_label_age)
        val tvAge: TextView = view.findViewById(R.id.tvAge)
        val tvLabelId: TextView = view.findViewById(R.id.tv_label_id)
        val tvId: TextView = view.findViewById(R.id.tvId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_card, parent,false)
        return UsersViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataSet.count()

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        val currentItem = dataSet[position]
        holder.tvNome.setText(currentItem.Name)
        holder.tvEmail.setText(currentItem.Email)
        holder.tvAge.setText(currentItem.Age.toString())
        holder.tvId.setText(currentItem.Id.toString())
    }
}
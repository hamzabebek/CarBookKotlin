package com.example.carbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carbookkotlin.databinding.RecyclerRowBinding

class carlistadapter(val carlist : ArrayList<Cars>) : RecyclerView.Adapter<carlistadapter.carholder>(){
    class carholder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): carholder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return carholder(binding)

    }

    override fun onBindViewHolder(holder: carholder, position: Int) {
       holder.binding.recyclerViewImageView.setImageResource(carlist.get(position).image)
        holder.binding.recyclerViewTextView.text = carlist.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,CarDetails::class.java)
            intent.putExtra("car",carlist.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return carlist.size
    }
}
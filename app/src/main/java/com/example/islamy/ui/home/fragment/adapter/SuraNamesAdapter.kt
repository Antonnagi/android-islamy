package com.example.islamy.ui.home.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.R

class SuraNamesAdapter(val  item:List<String>): RecyclerView.Adapter<SuraNamesAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.item_chapter_name,parent,false)
    return  viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val items=item.get(position)
        holder.name.text=items
        if(onItemCLickListner!=null){
            holder.itemView.setOnClickListener{
                onItemCLickListner?.onItemClick(position,items)
            }
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }
    var onItemCLickListner:OnItemCLickListner?=null
    interface OnItemCLickListner{
        fun onItemClick(pos:Int,Item:String){}
    }
    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name=itemView.findViewById<TextView>(R.id.chapter_Name_label)

    }
}
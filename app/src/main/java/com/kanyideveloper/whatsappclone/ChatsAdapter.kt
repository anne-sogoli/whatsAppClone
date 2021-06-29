package com.kanyideveloper.whatsappclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatsAdapter(private val chatsList: ArrayList<Chat>) : RecyclerView.Adapter<ChatsAdapter.MyViewHolder>(){


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val chatImageView : ImageView = itemView.findViewById(R.id.chatImageView)
        val chatTitleTextView: TextView = itemView.findViewById(R.id.chatTitleTextView)
        val chatTextView: TextView = itemView.findViewById(R.id.chatTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.chats_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.chatImageView.setImageResource(chatsList[position].image)
        holder.chatTitleTextView.text = chatsList[position].chatTitle
        holder.chatTextView.text = chatsList[position].chatMessage
    }

    override fun getItemCount(): Int {
        return chatsList.size
    }
}
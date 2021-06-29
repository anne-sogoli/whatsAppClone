package com.kanyideveloper.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ChatsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.chatsRecyclerView)


        val chatsList = arrayListOf<Chat>(
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message"),
            Chat(R.drawable.ic_launcher_background, "DSC Kibabii", "message")
        )

        adapter = ChatsAdapter(chatsList)

        recyclerView.adapter = adapter


    }


}
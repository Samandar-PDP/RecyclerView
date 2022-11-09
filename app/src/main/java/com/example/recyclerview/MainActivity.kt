package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.PostAdapter
import com.example.recyclerview.adapter.RecyclerViewAdapter
import com.example.recyclerview.model.Post

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var postAdapter: PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        supportActionBar?.hide()
        recyclerViewAdapter = RecyclerViewAdapter(footballClubs())
        postAdapter = PostAdapter(postList())

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = postAdapter
        }

    }

    private fun postList(): ArrayList<Post> {
        return arrayListOf(
            Post(
                R.drawable.ic_launcher_background,
                "ketmonjon",
                R.drawable.ic_launcher_background,
                123,
                "#android",
                56,
                6
            ),
            Post(
                R.drawable.ic_launcher_background,
                "ketmonjon",
                R.drawable.ic_launcher_background,
                123,
                "#android",
                56,
                6
            ),
            Post(
                R.drawable.ic_launcher_background,
                "ketmonjon",
                R.drawable.ic_launcher_background,
                123,
                "#android",
                56,
                6
            ),
            Post(
                R.drawable.ic_launcher_background,
                "ketmonjon",
                R.drawable.ic_launcher_background,
                123,
                "#android",
                56,
                6
            ),
            Post(
                R.drawable.ic_launcher_background,
                "ketmonjon",
                R.drawable.ic_launcher_background,
                123,
                "#android",
                56,
                6
            ),
            Post(
                R.drawable.ic_launcher_background,
                "ketmonjon",
                R.drawable.ic_launcher_background,
                123,
                "#android",
                56,
                6
            ),
        )
    }

    private fun footballClubs(): MutableList<String> {
        return mutableListOf(
            "Real Madrid",
            "Barcelona",
            "Bayern Munch",
            "Liverpool",
            "Man City",
            "Tottenham",
            "Juventus",
            "Inter",
            "AtmMadrid",
            "PSG",
            "Chelsea",
            "Man Utd",
            "Real Madrid",
            "Barcelona",
            "Bayern Munch",
            "Liverpool",
            "Man City",
            "Tottenham",
            "Juventus",
            "Inter",
            "AtmMadrid",
            "PSG",
            "Chelsea",
            "Man Utd",
        )
    }
}
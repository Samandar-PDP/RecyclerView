package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Post
import com.google.android.material.imageview.ShapeableImageView

class PostAdapter(
    private val postList: ArrayList<Post>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PostViewHolder).bind(postList[position])
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    inner class PostViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(post: Post) {
            val profileImage: ShapeableImageView = view.findViewById(R.id.profileImage)
            val userName: TextView = view.findViewById(R.id.textName)
            val postedImage: ImageView = view.findViewById(R.id.postedImage)
            val textViews: TextView = view.findViewById(R.id.textViews)
            val hashTag: TextView = view.findViewById(R.id.textHash)
            val comments: TextView = view.findViewById(R.id.textComments)
            val whenUpload: TextView = view.findViewById(R.id.textWhen)

            profileImage.setImageResource(post.profileImage)
            userName.text = post.name
            postedImage.setImageResource(post.postedImage)
            textViews.text = post.views.toString()
            hashTag.text = post.hashTag
            comments.text = post.comments.toString()
            whenUpload.text = "${post.whenUploaded} days ago"
        }
    }
}
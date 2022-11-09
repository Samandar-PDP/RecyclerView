package com.example.recyclerview.model

import androidx.annotation.DrawableRes

data class Post(
    @DrawableRes val profileImage: Int,
    val name: String,
    @DrawableRes val postedImage: Int,
    val views: Int,
    val hashTag: String,
    val comments: Int,
    val whenUploaded: Int
)

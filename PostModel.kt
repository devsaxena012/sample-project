package com.example.sample_project

import android.media.Image


data class PostModel(
    val id: Int? = null,
    val name: String? = null,
    val subjects:String? = null,
    val qualification:String? = null,
    val profileImage: Image? = null

)
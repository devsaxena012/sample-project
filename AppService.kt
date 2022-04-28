package com.example.sample_projecthttps



import android.telecom.Call
import com.example.sample_project.PostModel
import retrofit2.http.GET

interface AppService {
    @GET("/posts")
    fun getPosts(): Call<MutableList<PostModel>>
}
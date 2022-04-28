package com.example.sample_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.sample_projecthttps.AppService
import com.google.android.material.navigation.NavigationView
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getmydata()
        displaylist()
    }
fun getmydata(){
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/easygautam/data/users")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(AppService::class.java)

    val retrofitData = retrofit.getPosts()
    retrofitData.enqueue(object : Callback<MutableList<PostModel>?>
    { override fun onResponse(call:Call<MutableList<PostModel>?>, response: Response<MutableList<PostModel>?>){
        val responseBody = response.body()!!
        for (mydata in responseBody){
            myStringBuilder.append(mydata.id)
        }
    }
}
    val recyclerView = findViewById<RecyclerView>(R.id.recyclerlist)


    private fun displaylist() {
        val fragment = list_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)
        transaction.commit()
        supportActionBar?.title = "Robby Darling"
    }
}


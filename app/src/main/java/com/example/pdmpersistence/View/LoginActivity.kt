package com.example.pdmpersistence.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pdmpersistence.Persistencia.APIService
import com.example.pdmpersistence.Persistencia.AppDatabase
import com.example.pdmpersistence.Persistencia.Models.Client
import com.example.pdmpersistence.Persistencia.ResponseAPI
import com.example.pdmpersistence.R
import org.jetbrains.anko.doAsync
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Query

class LoginActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        db = AppDatabase.getInstance(this)

    }

    private fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://aqueous-earth-47838.herokuapp.com/api/v1/rest/client")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByName(query: String) {
        doAsync {
            val call = getRetrofit().create(APIService::class.java).getById("$query/id").execute()
            val responseAPI = call.body() as ResponseAPI
            val client = Client()
            if (client.email != null) {
                //initCharacter(responseAPI)
            } else {
                //showErrorDialog()
            }
            //hideKeyboard()
        }
    }
}
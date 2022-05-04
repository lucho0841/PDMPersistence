package com.example.pdmpersistence.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pdmpersistence.Persistencia.AppDatabase
import com.example.pdmpersistence.R

class LoginActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        db = AppDatabase.getInstance(this)

    }
}
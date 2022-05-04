package com.example.pdmpersistence.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.pdmpersistence.Persistencia.AppDatabase
import com.example.pdmpersistence.Persistencia.DTO.UserDTO
import com.example.pdmpersistence.R
import java.sql.Timestamp
import java.time.format.DateTimeFormatter
import java.util.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        db = AppDatabase.getInstance(this)

        val userName = findViewById<EditText>(R.id.et_username)
        val correo = findViewById<EditText>(R.id.et_email)
        val contrasena = findViewById<EditText>(R.id.et_password)
        val confirmContrasena = findViewById<EditText>(R.id.et_confirm_password)

        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            createUser(UserDTO(0, userName.text.toString(), correo.text.toString(), contrasena.text.toString(), Timestamp(Date().time), false))
        }
    }

    private fun createUser(user: UserDTO){
        db.userDAO().insertAll(user)
    }
}
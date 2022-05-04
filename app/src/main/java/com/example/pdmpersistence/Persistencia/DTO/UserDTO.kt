package com.example.pdmpersistence.Persistencia.DTO

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp
import java.time.format.DateTimeFormatter

@Entity(tableName = "users")
data class UserDTO (
    @PrimaryKey(autoGenerate = true) val userId: Int,
    @ColumnInfo val nombreUsuario: String ,
    @ColumnInfo val correo: String,
    @ColumnInfo val contrasena: String,
    @ColumnInfo val fechaCreacion: Timestamp,
    @ColumnInfo val inactive: Boolean,

)


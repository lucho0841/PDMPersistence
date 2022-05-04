package com.example.pdmpersistence.Persistencia

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pdmpersistence.Persistencia.DAO.UserDAO
import com.example.pdmpersistence.Persistencia.DTO.UserDTO

@Database(entities = [UserDTO::class], version = 1, exportSchema = false)

abstract class AppDatabase:RoomDatabase() {
    companion object{
        private const val DATABASE_NAME = "storage.db"

        private lateinit var instance : AppDatabase

        fun getInstance(context: Context?): AppDatabase {
            if (::instance.isInitialized){
                return instance
            } else {
                instance = Room.databaseBuilder(
                    context!!.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                )
                    .allowMainThreadQueries()
                    .build()
                return instance
            }
        }
    }

    abstract fun userDAO(): UserDAO
}
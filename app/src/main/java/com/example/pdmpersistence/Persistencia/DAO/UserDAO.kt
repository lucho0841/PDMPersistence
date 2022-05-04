package com.example.pdmpersistence.Persistencia.DAO

import androidx.room.*
import com.example.pdmpersistence.Persistencia.DTO.UserDTO

@Dao
interface UserDAO {
    @Query("SELECT * FROM UserDTO")
    fun getAll(): List<UserDTO>

    @Query("SELECT * FROM UserDTO WHERE userId =:userId")
    fun findById(userId: Int): UserDTO

    @Insert
    fun insertAll(vararg users: UserDTO)

    @Update
    fun update(user: UserDTO)

    @Delete
    fun delete(user: UserDTO)

    @Query("DELETE FROM UserDTO")
    fun deleteAll()
}
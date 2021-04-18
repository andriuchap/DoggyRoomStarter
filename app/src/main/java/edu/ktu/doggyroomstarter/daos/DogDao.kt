package edu.ktu.doggyroomstarter.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import edu.ktu.doggyroomstarter.models.Dog
import kotlinx.coroutines.flow.Flow

@Dao
interface DogDao {

    @Query("SELECT * FROM dogs")
    fun getAllDogs(): Flow<List<Dog>>

    @Insert
    suspend fun insertAll(vararg dog: Dog)

    @Delete
    suspend fun delete(dog: Dog)
}
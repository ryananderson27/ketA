package com.example.keta.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.keta.models.StepCount

@Database(entities = [StepCount::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun stepsDao(): StepsDao
}
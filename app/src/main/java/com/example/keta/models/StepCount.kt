package com.example.keta.models

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "steps")
data class StepCount(
    @ColumnInfo(name = "steps") val steps: Long,
    @ColumnInfo(name = "created_at") val createdAt: String,
)

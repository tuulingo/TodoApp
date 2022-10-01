package com.tuulingo.todoapp.data.todo

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    val categoryId: Int?,
    val dateModified: String,
    @PrimaryKey val todoId: Int? = null
)

package com.tuulingo.todoapp.data.categories

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tuulingo.todoapp.data.todo.Todo

@Entity
data class Category(
    val title: String,
    val todos: List<Todo>,
    @PrimaryKey val categoryId: Int? = null
)
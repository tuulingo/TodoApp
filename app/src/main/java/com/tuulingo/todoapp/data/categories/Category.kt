package com.tuulingo.todoapp.data.categories

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
    val title: String,
    @PrimaryKey val id: Int? = null
)
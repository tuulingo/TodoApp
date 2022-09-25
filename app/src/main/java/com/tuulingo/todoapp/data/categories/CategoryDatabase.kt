package com.tuulingo.todoapp.data.Categories

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tuulingo.todoapp.data.Todo.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class CategoryDatabase: RoomDatabase() {

    abstract val categoryDao: CategoryDao
}
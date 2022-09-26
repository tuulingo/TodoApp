package com.tuulingo.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tuulingo.todoapp.data.categories.Category
import com.tuulingo.todoapp.data.categories.CategoryDao
import com.tuulingo.todoapp.data.todo.Todo
import com.tuulingo.todoapp.data.todo.TodoDao

@Database(
    entities = [
        Todo::class,
        Category::class
               ],
    version = 2
)
abstract class TodoDatabase : RoomDatabase() {

    abstract val todoDao: TodoDao
    abstract val categoryDao: CategoryDao
}
package com.tuulingo.todoapp.di

import android.app.Application
import androidx.room.Room
import com.tuulingo.todoapp.data.categories.CategoryRepository
import com.tuulingo.todoapp.data.categories.CategoryRepositoryImpl
import com.tuulingo.todoapp.data.TodoDatabase
import com.tuulingo.todoapp.data.todo.TodoRepository
import com.tuulingo.todoapp.data.todo.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase
    {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(db.todoDao)
    }

    @Provides
    @Singleton
    fun provideCategoryDatabase(app: Application): CategoryDatabase
    {
        return Room.databaseBuilder(
            app,
            CategoryDatabase::class.java,
            "catergory_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideCategoryRepository(db: CategoryDatabase): CategoryRepository {
        return CategoryRepositoryImpl(db.categoryDao)
    }
}
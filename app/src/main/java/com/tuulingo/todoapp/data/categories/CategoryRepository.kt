package com.tuulingo.todoapp.data.categories

import com.tuulingo.todoapp.data.relations.CategoryWithTodos
import com.tuulingo.todoapp.data.todo.Todo
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {

    suspend fun insertCategory(category: Category)

    suspend fun deleteCategory(category: Category)

    suspend fun getCategoryById(categoryId: Int): Category?

    fun getCategories(): Flow<List<Category>>

    suspend fun getCategoryWithTodos(categoryId: Int): CategoryWithTodos
}
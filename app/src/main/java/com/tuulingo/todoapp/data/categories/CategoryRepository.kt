package com.tuulingo.todoapp.data.categories

import kotlinx.coroutines.flow.Flow

interface CategoryRepository {

    suspend fun insertCategory(category: Category)

    suspend fun deleteCategory(category: Category)

    suspend fun getCategoryById(id: Int): Category?

    fun getCategories(): Flow<List<Category>>
}
package com.tuulingo.todoapp.data.Categories

import kotlinx.coroutines.flow.Flow

class CategoryRepositoryImpl(
    private val dao: CategoryDao
): CategoryRepository {
    override suspend fun insertCategory(category: Category) {
        dao.insertCategory(category)
    }

    override suspend fun deleteCategory(category: Category) {
        dao.deleteCategory(category)
    }

    override suspend fun getCategoryById(id: Int): Category? {
        return dao.getCategoryById(id)
    }

    override fun getCategories(): Flow<List<Category>> {
        return dao.getCategories()
    }
}
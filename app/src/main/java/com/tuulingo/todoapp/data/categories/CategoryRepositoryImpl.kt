package com.tuulingo.todoapp.data.categories

import com.tuulingo.todoapp.data.relations.CategoryWithTodos
import com.tuulingo.todoapp.data.todo.Todo
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

    override suspend fun getCategoryById(categoryId: Int): Category? {
        return dao.getCategoryById(categoryId)
    }

    override fun getCategories(): Flow<List<Category>> {
        return dao.getCategories()
    }

    override suspend fun getCategoryWithTodos(categoryId: Int): CategoryWithTodos {
        return dao.getCategoryWithTodos(categoryId)
    }
}
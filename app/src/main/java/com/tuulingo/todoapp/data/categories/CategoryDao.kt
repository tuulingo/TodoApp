package com.tuulingo.todoapp.data.categories

import androidx.room.*
import com.tuulingo.todoapp.data.relations.CategoryWithTodos
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: Category)

    @Delete
    suspend fun deleteCategory(category: Category)

    @Query("SELECT * FROM category WHERE categoryId = :id")
    suspend fun getCategoryById(id: Int): Category?

    @Query("SELECT * FROM category")
    fun getCategories(): Flow<List<Category>>

    @Transaction
    @Query("SELECT * FROM category WHERE categoryId = categoryId")
    suspend fun getCategoryWithTodos(categoryId: Int): Flow<List<CategoryWithTodos>>
}
package com.tuulingo.todoapp.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.tuulingo.todoapp.data.categories.Category
import com.tuulingo.todoapp.data.todo.Todo

data class CategoryWithTodos(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "categoryId",
        entityColumn = "todoId"
    )
    val todos: List<Todo>
)

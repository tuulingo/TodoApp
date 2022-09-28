package com.tuulingo.todoapp.ui.category.category_list

import com.tuulingo.todoapp.data.categories.Category

sealed class CategoryEvent {
    data class OnDeleteCategoryClick(val category: Category): CategoryEvent()
    object OnUndoDeleteClick: CategoryEvent()
    data class OnCategoryClick(val category: Category): CategoryEvent()
    object OnAddCategoryClick: CategoryEvent()
}
package com.tuulingo.todoapp.ui.todo_list

import androidx.lifecycle.ViewModel
import com.tuulingo.todoapp.data.TodoRepository
import com.tuulingo.todoapp.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
): ViewModel() {

    val todos = repository.getTodos()

    private val _uiEvenet = Channel<UiEvent>()
    val uiEvent = _uiEvenet.receiveAsFlow()

    fun onEvent(event: TodoListEvent) {
        when (event) {
            is TodoListEvent.OnAddTodoClick -> {

            }
            is TodoListEvent.OnUndoDeleteClick -> {

            }
            is TodoListEvent.OnDeleteTodoClick -> {

            }
            is TodoListEvent.OnDoneChange -> {

            }
            is TodoListEvent.OnTodoClick -> {

            }
        }
    }
}
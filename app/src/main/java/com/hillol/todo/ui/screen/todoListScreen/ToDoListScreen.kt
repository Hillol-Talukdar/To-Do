package com.hillol.todo.ui.screen.todoListScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ToDoListScreen : ComponentActivity() {
    private val todoListScreenView = ToDoListScreenView()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            todoListScreenView.TodoScreenUI()
        }
    }
}
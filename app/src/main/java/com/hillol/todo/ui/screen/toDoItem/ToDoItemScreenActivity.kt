package com.hillol.todo.ui.screen.toDoItem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ToDoItemScreenActivity : ComponentActivity() {
    private val toDoItemScreenView = ToDoItemScreenView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            toDoItemScreenView.TodoScreenUI()
        }
    }
}
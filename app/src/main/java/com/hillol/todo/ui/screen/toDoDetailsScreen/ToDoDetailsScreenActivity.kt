package com.hillol.todo.ui.screen.toDoDetailsScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ToDoDetailsScreenActivity : ComponentActivity() {
    private val toDoDetailsScreenView = ToDoDetailsScreenView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            toDoDetailsScreenView.ToDoDetailsScreenUI()
        }
    }
}
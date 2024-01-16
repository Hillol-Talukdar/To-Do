package com.hillol.todo.ui.screen.toDoListScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hillol.todo.data.utils.NoteDataUtils

class ToDoListScreenActivity : ComponentActivity() {
    private val todoListScreenView = ToDoListScreenView()
    private val todoListScreenViewModel = ToDoListScreenViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        NoteDataUtils.noteList = ArrayList()

        setContent {
            todoListScreenView.OnCreate(this, todoListScreenViewModel)
        }
    }
}
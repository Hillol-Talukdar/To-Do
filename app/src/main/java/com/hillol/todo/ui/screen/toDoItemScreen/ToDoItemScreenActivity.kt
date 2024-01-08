package com.hillol.todo.ui.screen.toDoItemScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hillol.todo.data.utils.NoteData

class ToDoItemScreenActivity : ComponentActivity() {
    companion object {
        fun createDefault() = ToDoItemScreenActivity()
    }
    private val toDoItemScreenView = ToDoItemScreenView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            toDoItemScreenView.TodoScreenUI(this, NoteData.noteList[0])
        }
    }
}
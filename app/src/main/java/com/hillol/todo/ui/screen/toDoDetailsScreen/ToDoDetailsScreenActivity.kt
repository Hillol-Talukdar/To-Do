package com.hillol.todo.ui.screen.toDoDetailsScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hillol.todo.data.model.Note

class ToDoDetailsScreenActivity : ComponentActivity() {
    private val toDoDetailsScreenView = ToDoDetailsScreenView()
    private var note: Note? = null
        get() = field
        set(value) {
            field = value
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSerializedData()
        setContent {
            toDoDetailsScreenView.OnCreate(note)
        }
    }

    private fun getSerializedData() {
        val receivedBundle = intent.extras
        note = receivedBundle?.getSerializable("NoteItemModel") as Note?
    }
}
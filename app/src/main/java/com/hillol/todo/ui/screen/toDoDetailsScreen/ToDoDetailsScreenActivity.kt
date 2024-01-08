package com.hillol.todo.ui.screen.toDoDetailsScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hillol.todo.data.model.NoteItemModel

class ToDoDetailsScreenActivity : ComponentActivity() {
    private val toDoDetailsScreenView = ToDoDetailsScreenView()
    private var noteItemModel: NoteItemModel? = null
        get() = field
        set(value) {
            field = value
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSerializedData()
        setContent {
            toDoDetailsScreenView.OnCreate(noteItemModel)
        }
    }

    private fun getSerializedData() {
        val receivedBundle = intent.extras
        noteItemModel = receivedBundle?.getSerializable("NoteItemModel") as NoteItemModel?
    }
}
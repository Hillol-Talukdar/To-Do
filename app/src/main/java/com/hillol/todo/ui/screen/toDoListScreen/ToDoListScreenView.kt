package com.hillol.todo.ui.screen.toDoListScreen

import android.app.Activity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hillol.todo.data.model.NoteItemModel
import com.hillol.todo.data.utils.NoteData
import com.hillol.todo.ui.screen.toDoItemScreen.ToDoItemScreenView
import com.hillol.todo.ui.screen.toDoListScreen.ui.theme.ToDoTheme

class ToDoListScreenView {
    @Preview(showBackground = true)
    @Composable
    fun TodoScreenUI(activity: Activity = Activity(), modifier: Modifier = Modifier) {
        ToDoTheme {
            Surface(
                modifier = modifier.fillMaxSize(),
                color = Color.Black
            ) {
                ToDoRecyclerView(activity)
            }
        }
    }

    @Composable
    fun ToDoRecyclerView(activity: Activity, modifier: Modifier = Modifier) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(5.dp)
        ) {
            items(NoteData.noteList) { noteItem ->
                ToDoRecyclerViewItem(activity, noteItem)
            }
        }
    }

    @Composable
    fun ToDoRecyclerViewItem(activity: Activity, noteItem: NoteItemModel) {
        val toDoItemScreenView = ToDoItemScreenView()
        toDoItemScreenView.TodoScreenUI(activity, noteItem)
    }
}
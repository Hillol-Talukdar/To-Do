package com.hillol.todo.ui.screen.toDoDetailsScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hillol.todo.ui.screen.toDoDetailsScreen.ui.theme.ToDoTheme
import androidx.compose.ui.graphics.Color

class ToDoDetailsScreenView {
    @Preview(showBackground = true)
    @Composable
    fun ToDoDetailsScreenUI(modifier: Modifier = Modifier) {
        ToDoTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.Black
            ) {
                ScreenLayout(modifier)
            }
        }
    }

    @Composable
    fun ScreenLayout(modifier: Modifier = Modifier) {

    }

}
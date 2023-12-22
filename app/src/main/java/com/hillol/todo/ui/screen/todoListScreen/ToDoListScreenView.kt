package com.hillol.todo.ui.screen.todoListScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.hillol.todo.ui.screen.todoListScreen.ui.theme.ToDoTheme

class ToDoListScreenView {
    @Preview(showBackground = true)
    @Composable
    fun TodoScreenUI(modifier: Modifier = Modifier) {
        ToDoTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.Black
            ) {
                ListLayout()
            }
        }
    }

    @Composable
    fun ListLayout(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            Text(
                text = "Title",
                color = Color.White,
                fontSize = 20.sp,
                modifier = modifier
            )
            Text(
                text = "description",
                color = Color.White,
                fontSize = 16.sp,
                modifier = modifier
            )
        }
    }
}
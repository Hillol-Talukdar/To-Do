package com.hillol.todo.ui.screen.todoListScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
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
        ConstraintLayout(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            val (titleText, descriptionText) = createRefs()

            Text(
                text = "Title",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.constrainAs(titleText) {
                    top.linkTo(parent.top, margin = 10.dp)
                    start.linkTo(parent.start, margin = 10.dp)
                    end.linkTo(parent.end, margin = 10.dp)
                }
            )

            Text(
                text = "description",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.constrainAs(descriptionText) {
                    top.linkTo(titleText.bottom, margin = 2.dp)
                    start.linkTo(titleText.start)
                    end.linkTo(titleText.end)
                }
            )
        }
    }
}
package com.hillol.todo.ui.screen.toDoDetailsScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hillol.todo.ui.screen.toDoDetailsScreen.ui.theme.ToDoTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.hillol.todo.data.model.Note

class ToDoDetailsScreenView {
    private var noteItem: Note? = null

    @Composable
    fun OnCreate(note: Note?) {
        noteItem = note
        ToDoDetailsScreenUI()
    }

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

        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            val (titleText, descriptionText) = createRefs()

            Text(
                text = noteItem?.title ?: "title",
                color = Color.White,
                fontSize = 20.sp,
                modifier = modifier
                    .constrainAs(titleText) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.matchParent
                    }
            )

            Text(
                text = noteItem?.description ?: "description",
                color = Color.White,
                fontSize = 16.sp,
                modifier = modifier
                    .constrainAs(descriptionText) {
                        top.linkTo(titleText.bottom, margin = 2.dp)
                        start.linkTo(titleText.start)
                        end.linkTo(titleText.end)
                        width = Dimension.matchParent
                    }
            )

        }
    }

}
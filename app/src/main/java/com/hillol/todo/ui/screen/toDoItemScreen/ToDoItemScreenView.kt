package com.hillol.todo.ui.screen.toDoItemScreen

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.hillol.todo.data.model.NoteItemModel
import com.hillol.todo.ui.screen.toDoListScreen.ui.theme.ToDoTheme
import com.hillol.todo.utils.OpenScreenUtils

class ToDoItemScreenView {
    @Preview(showBackground = true)
    @Composable
    fun TodoScreenUI(
        activity: Activity? = ToDoItemScreenActivity.createDefault(),
        noteItem: NoteItemModel? = null,
        modifier: Modifier = Modifier
    ) {
        ToDoTheme {
            Surface(
                modifier = modifier.fillMaxSize(),
                color = Color.Black
            ) {
                ListLayout(activity!!, noteItem, modifier)
            }
        }
    }

    @Composable
    fun ListLayout(activity: Activity, noteItem: NoteItemModel?, modifier: Modifier = Modifier) {
        ConstraintLayout(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(color = Color(android.graphics.Color.parseColor("#363f4d")))
                .height(IntrinsicSize.Max)
                .clickable { OpenScreenUtils.goToToDoDetailsScreen(activity) }
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
                    .padding(8.dp)
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
                    .padding(8.dp)
            )
        }
    }
}
package com.hillol.todo.ui.screen.toDoListScreen

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hillol.todo.data.model.Note
import com.hillol.todo.data.utils.NoteDataUtils
import com.hillol.todo.ui.screen.toDoItemScreen.ToDoItemScreenView
import com.hillol.todo.ui.screen.toDoListScreen.ui.theme.ToDoTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.hillol.todo.R


class ToDoListScreenView {
    private var todoListScreenViewModel: ToDoListScreenViewModel? = null

    @Composable
    fun OnCreate(activity: Activity, todoListScreenViewModel: ToDoListScreenViewModel) {
        this.todoListScreenViewModel = todoListScreenViewModel
        TodoScreenUI(activity)
    }

    @Preview(showBackground = true)
    @Composable
    fun TodoScreenUI(activity: Activity = Activity(), modifier: Modifier = Modifier) {
        ToDoTheme {
            ConstraintLayout(
                modifier = modifier
                    .fillMaxSize()
                    .background(Color.Black),
            ) {
                val (searchBar, toDoRecyclerView) = createRefs()

                SearchBar(modifier = Modifier.constrainAs(searchBar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.matchParent
                })

                ToDoRecyclerView(activity, modifier = Modifier.constrainAs(toDoRecyclerView) {
                    top.linkTo(searchBar.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                })
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun SearchBar(modifier: Modifier) {
        var query by remember { mutableStateOf("") }
        TextField(
            modifier = modifier,
            value = query,
            onValueChange = {
                query = it
//                onSearch(it)
            },
            placeholder = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = stringResource(id = R.string.search)
                )
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
//                    onSearch(query)
                }
            ),
            colors = TextFieldDefaults.textFieldColors(
                textColor = MaterialTheme.colorScheme.onSurface,
                cursorColor = MaterialTheme.colorScheme.primary
            )
        )
    }

    @Composable
    fun ToDoRecyclerView(activity: Activity, modifier: Modifier = Modifier) {
        LazyColumn(
            modifier = modifier.background(Color.Black)
        ) {
            items(NoteDataUtils.noteList) { noteItem ->
                ToDoRecyclerViewItem(activity, noteItem)
            }
        }
    }

    @Composable
    fun ToDoRecyclerViewItem(activity: Activity, noteItem: Note) {
        val toDoItemScreenView = ToDoItemScreenView()
        toDoItemScreenView.TodoScreenUI(activity, noteItem)
    }
}
package com.hillol.todo.ui.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hillol.todo.ui.theme.ToDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            previewUI()
        }
    }


    fun openScreen() {

    }
}

@Composable
fun previewUI() {
    ToDoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        ) {
            Column () {
                Greeting("Android")
                goToToDoScreen(onClick = { MainActivity().openScreen() })
            }
        }
    }
}


@Composable
fun NavGraph() {

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun goToToDoScreen(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(onClick = onClick) {
        Text(text = "Open To-Do List")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    previewUI()
}



package com.hillol.todo.utils

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.hillol.todo.ui.screen.toDoDetailsScreen.ToDoDetailsScreenActivity
import com.hillol.todo.ui.screen.toDoListScreen.ToDoListScreenActivity

object OpenScreenUtils {
    private const val TAG = "OpenScreenUtils"

    fun goToToDoListScreen(activity: Activity) {
        val intent = Intent(activity, ToDoListScreenActivity::class.java)
        activity.startActivity(intent)
        activity.finish()
    }

    fun goToToDoDetailsScreen(activity: Activity, data: Bundle?, shouldFinish: Boolean) {
        val intent = Intent(activity, ToDoDetailsScreenActivity::class.java)
        data?.let {
            intent.putExtras(it)
        }

        activity.startActivity(intent)
        if (shouldFinish) {
            activity.finish()
        }
    }
}
package com.hillol.todo.ui.screen.toDoListScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hillol.todo.data.model.Note
import com.hillol.todo.data.utils.NoteDataUtils

class ToDoListScreenViewModel : ViewModel() {

    private var _noteList = MutableLiveData(NoteDataUtils.noteList)
    val noteList: LiveData<ArrayList<Note>>
        get() = _noteList

    fun onSearch(query: String) {
        _noteList.postValue(getUpdatedList(query))
    }

    private fun getUpdatedList(query: String): ArrayList<Note> {
        return if (query.isEmpty()) {
            NoteDataUtils.noteList
        } else {
            NoteDataUtils.noteList.filter {
                it.title?.contains(query, ignoreCase = true) ?: false
            } as ArrayList<Note>
        }
    }
}
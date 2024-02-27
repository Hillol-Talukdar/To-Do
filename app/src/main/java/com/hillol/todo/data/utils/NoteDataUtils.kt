package com.hillol.todo.data.utils

import com.hillol.todo.data.model.Note

class NoteDataUtils {
    companion object {
        var noteList: ArrayList<Note> = ArrayList()
            get() = field
            set(value) {
                field = if (value == null || value.isEmpty()) {
                    defaultNoteList()
                } else {
                    ArrayList(value)
                }
            }

        private fun defaultNoteList(): ArrayList<Note> {
            return arrayListOf(
                Note(0, "Title1", "Description1"),
                Note(1, "Title2", "Description2"),
                Note(2, "Title3", "Description3"),
                Note(3, "Title4", "Description4"),
                Note(4, "Hellow", "world"),
            )
        }
    }
}
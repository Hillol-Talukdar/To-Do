package com.hillol.todo.data.utils

import com.hillol.todo.data.model.NoteItemModel

class NoteData {
    companion object {
        var noteList: ArrayList<NoteItemModel> = ArrayList()
            get() = field
            set(value) {
                field = if (value == null || value.isEmpty()) {
                    defaultNoteList()
                } else {
                    ArrayList(value)
                }
        }

        private fun defaultNoteList(): ArrayList<NoteItemModel> {
            return arrayListOf(
                NoteItemModel("Title1", "Description1"),
                NoteItemModel("Title2", "Description2"),
                NoteItemModel("Title3", "Description3"),
                NoteItemModel("Title4", "Description4")
            )
        }
    }
}
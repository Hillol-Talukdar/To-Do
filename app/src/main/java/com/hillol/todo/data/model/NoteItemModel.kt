package com.hillol.todo.data.model

import java.io.Serializable


data class NoteItemModel(
    var title: String,
    var description: String
) : Serializable {

}

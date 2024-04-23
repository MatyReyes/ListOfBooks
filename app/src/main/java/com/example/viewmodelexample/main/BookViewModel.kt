package com.example.viewmodelexample.main


import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {
    var state by mutableStateOf(BookState())
        private set


    init {
        viewModelScope.launch {

            delay(5000)

            state = state.copy(
                books = listOf(
                    Book("Clean Code", "Robert C Martin"),
                    Book("Refactoring", "Martin Fowler"),
                    Book("Effective Java", "Joshua Bloch")
                ),

                isLoading = false
            )
        }
    }
    fun onBookClicked(book: Book){
        val index = state.books.indexOf(book)
        val updatedBooks = state.books.toMutableList()
        updatedBooks.removeAt(index)

        state = state.copy(
            books = updatedBooks
        )
    }
}
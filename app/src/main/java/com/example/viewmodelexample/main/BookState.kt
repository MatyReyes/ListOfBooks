package com.example.viewmodelexample.main

data class BookState(
    val books: List<Book> = listOf(),
    val isLoading: Boolean = true
)

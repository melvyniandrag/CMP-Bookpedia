package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book ${it}",
        imageUrl = "https://test.com",
        authors = listOf("Melvyn Drag"),
        description = "Description ${it}",
        firstPublishedYear = null,
        averageRating = 4.3325,
        ratingCount = 5,
        languages = emptyList(),
        numPages = 100,
        numEditions = 3
    )
}

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
    )
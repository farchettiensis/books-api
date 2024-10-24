package tech.ada.farchettiensis.booksapi.service;

import tech.ada.farchettiensis.booksapi.model.Book;

import java.util.List;

public interface BookService {
    Book getBookById(Long id);

    List<Book> getAllBooks();

    Book createBook(Book book);

    Book updateBook(Long id, Book book);

    void deleteBook(Long id);
}


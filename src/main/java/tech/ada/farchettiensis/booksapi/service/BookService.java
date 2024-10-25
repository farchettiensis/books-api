package tech.ada.farchettiensis.booksapi.service;

import tech.ada.farchettiensis.booksapi.model.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Book getBookById(Long id);

    List<Book> getAllBooks();

    List<Book> createBooks(List<Book> books);

    Book createBook(Book book);

    Book updateBook(Long id, Book book);

    void deleteBook(Long id);

    Book patchBook(Long id, Map<String, Object> updates);
}


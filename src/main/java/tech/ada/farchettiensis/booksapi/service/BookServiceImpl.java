package tech.ada.farchettiensis.booksapi.service;

import org.springframework.stereotype.Service;
import tech.ada.farchettiensis.booksapi.model.Book;
import tech.ada.farchettiensis.booksapi.repository.BookRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> createBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        Book existingBook = getBookById(id);
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setIsbn10(book.getIsbn10());
        existingBook.setIsbn13(book.getIsbn13());
        existingBook.setAsin(book.getAsin());
        existingBook.setPublicationDate(book.getPublicationDate());
        return bookRepository.save(existingBook);
    }

    public Book patchBook(Long id, Map<String, Object> updates) {
        Book existingBook = getBookById(id);

        if (updates.containsKey("title")) {
            existingBook.setTitle((String) updates.get("title"));
        }
        if (updates.containsKey("author")) {
            existingBook.setAuthor((List<String>) updates.get("author"));
        }
        if (updates.containsKey("isbn10")) {
            existingBook.setIsbn10((String) updates.get("isbn10"));
        }
        if (updates.containsKey("isbn13")) {
            existingBook.setIsbn13((String) updates.get("isbn13"));
        }
        if (updates.containsKey("asin")) {
            existingBook.setAsin((String) updates.get("asin"));
        }
        if (updates.containsKey("publicationDate")) {
            existingBook.setPublicationDate(LocalDate.parse((String) updates.get("publicationDate")));
        }

        return bookRepository.save(existingBook);
    }


    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}


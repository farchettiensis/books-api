package tech.ada.farchettiensis.booksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.farchettiensis.booksapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

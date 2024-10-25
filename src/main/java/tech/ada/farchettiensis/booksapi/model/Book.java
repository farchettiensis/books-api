package tech.ada.farchettiensis.booksapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "books")
public class Book extends BaseModel {
    @Column(nullable = false)
    private String title;

    // TODO: considerar embeddable
    @Column(nullable = false)
    @ElementCollection
    private List<String> author = new ArrayList<>();

    @Column(unique = true)
    private String isbn10;

    @Column(unique = true)
    private String isbn13;

    @Column(unique = true)
    private String asin;

    @Column
    private LocalDate publicationDate;
}

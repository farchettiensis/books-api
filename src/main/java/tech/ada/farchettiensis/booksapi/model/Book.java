package tech.ada.farchettiensis.booksapi.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
//@Table(name = "books")
public class Book extends BaseModel {
    private String title;
    private String author;
    private String isbn;
    private Date publicationDate;
}

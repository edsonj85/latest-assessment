package com.absa.practical.bookservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book", schema = "bookstore")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "book_author",
            schema = "bookstore",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> author;
    private String isbn;
    private BigDecimal price;
    private LocalDate datePublished;

}

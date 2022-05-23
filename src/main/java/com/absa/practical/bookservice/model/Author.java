package com.absa.practical.bookservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "author", schema = "bookstore")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    @ManyToMany
    private Set<Book> books;
    //Could have created this as a separate entity but for simplicity, I would keep it as string
    private String address;
}

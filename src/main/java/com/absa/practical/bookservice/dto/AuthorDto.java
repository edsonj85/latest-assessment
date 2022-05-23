package com.absa.practical.bookservice.dto;

import com.absa.practical.bookservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private Long id;
    private String fullName;
    private String address;
    private Set<Book> books;
}

package com.absa.practical.bookservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Long id;
    private String name;
    private String isbn;
    private BigDecimal price;
    private LocalDate datePublished;
    private Set<AuthorDto> author;
}

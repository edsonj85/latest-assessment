package com.absa.practical.bookservice.service;

import com.absa.practical.bookservice.dto.BookDto;
import com.absa.practical.bookservice.mapper.BookStoreMapper;
import com.absa.practical.bookservice.model.Book;
import com.absa.practical.bookservice.repo.BookRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Data
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookStoreMapper bookStoreMapper;

    public List<BookDto> findAll() {
        var books = bookRepository.findAll();
        return books.stream()
                .map(book->bookStoreMapper.mapBookToBookDto(book))
                .collect(Collectors.toList());
    }

    public void deleteBook(Long bookId){
        bookRepository.deleteById(bookId);
    }

    public BookDto saveOrUpdateBook(BookDto bookDto) {
        var book = bookStoreMapper.mapBookDtoToBook(bookDto);
        var savedBook = bookRepository.save(book);
        return bookStoreMapper.mapBookToBookDto(savedBook);
    }

    public BookDto findBookByISBN(String isbn) {
        var book = bookRepository.findByIsbn(isbn).orElse(null);
        return Objects.nonNull(book) ? bookStoreMapper.mapBookToBookDto(book) : null;
    }
}

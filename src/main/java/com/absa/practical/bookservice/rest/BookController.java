package com.absa.practical.bookservice.rest;

import com.absa.practical.bookservice.dto.BookDto;
import com.absa.practical.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @PostMapping("/save")
    public BookDto saveBook(@RequestBody BookDto bookDto) {
        return bookService.saveOrUpdateBook(bookDto);
    }

    @GetMapping("/all")
    public List<BookDto> findAllBooks() {
        return bookService.findAll();
    }

    @DeleteMapping("/{bookId}")
    public void deleteBookById(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
    }

    @GetMapping("/{isbn}")
    public BookDto findBookByISBN(@PathVariable String isbn) {
        return bookService.findBookByISBN(isbn);
    }
}

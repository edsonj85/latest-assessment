package com.absa.practical.bookservice.rest;

import com.absa.practical.bookservice.dto.AuthorDto;
import com.absa.practical.bookservice.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping("/save")
    public AuthorDto saveOrUpdate(@RequestBody AuthorDto authorDto) {
        return authorService.saveOrUpdateAuthor(authorDto);
    }

    @GetMapping("/all")
    public List<AuthorDto> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/{authorId}")
    public AuthorDto findAuthorById(Long authorId) {
        return authorService.findAuthorById(authorId);
    }

    @DeleteMapping("/{authorId}")
    public void deleteAuthorById(Long authorId) {
        authorService.deleteAuthorById(authorId);
    }
}

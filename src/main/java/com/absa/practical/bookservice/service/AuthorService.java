package com.absa.practical.bookservice.service;

import com.absa.practical.bookservice.dto.AuthorDto;
import com.absa.practical.bookservice.mapper.BookStoreMapper;
import com.absa.practical.bookservice.model.Author;
import com.absa.practical.bookservice.model.Book;
import com.absa.practical.bookservice.repo.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final BookStoreMapper bookStoreMapper;

    public AuthorDto saveOrUpdateAuthor(AuthorDto authorDto) {
        var author = bookStoreMapper.mapAuthorDtoToAuthor(authorDto);
        var savedAuthor = authorRepository.save(author);
        return bookStoreMapper.mapAuthorToAuthorDto(savedAuthor);
    }

    public List<AuthorDto> findAll() {
        var authors = authorRepository.findAll();
        return authors
                .stream()
                .map(author -> bookStoreMapper.mapAuthorToAuthorDto(author))
                .collect(Collectors.toList());
    }

    public AuthorDto findAuthorById(Long authorId) {
        var author = authorRepository.findById(authorId).orElse(null);
        return Objects.nonNull(author) ? bookStoreMapper.mapAuthorToAuthorDto(author) : null;
    }

    public void deleteAuthorById(Long authorId) {
        authorRepository.deleteById(authorId);
    }
}

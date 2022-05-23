package com.absa.practical.bookservice.repo;

import com.absa.practical.bookservice.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

package io.cantaruttim.libraryapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import io.cantaruttim.libraryapi.model.Books;

public interface BooksRepository extends JpaRepository<Books, UUID> {
    
}

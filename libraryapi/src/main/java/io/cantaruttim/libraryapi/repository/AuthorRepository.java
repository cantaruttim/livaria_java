package io.cantaruttim.libraryapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.cantaruttim.libraryapi.model.Author;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
    
}

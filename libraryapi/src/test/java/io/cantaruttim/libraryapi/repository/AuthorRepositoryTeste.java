package io.cantaruttim.libraryapi.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.cantaruttim.libraryapi.model.Author;

@SpringBootTest
public class AuthorRepositoryTeste {

    @Autowired
    AuthorRepository repository; 

    @Test
    public void salvarTeste(){

        Author author = new Author();
        author.setNome("Bruno");
        author.setNacionalidade("Brasileira");
        author.setDataNascimento(LocalDate.of(1950, 1, 31));

        var authorSaved = repository.save(author);
        System.out.println("Autor salvo com sucesso!" + authorSaved);
    }

}

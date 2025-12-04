package com.devops.microservices.author.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.devops.microservices.author.model.Author;
import com.devops.microservices.author.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllBooks() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @PutMapping("/{id}")
    public Author updateBook(@PathVariable Long id, @RequestBody Author author) {
        return authorService.updateAuthor(id, author);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
    	authorService.deleteAuthor(id);
    }
}
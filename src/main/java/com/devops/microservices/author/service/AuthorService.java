package com.devops.microservices.author.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devops.microservices.author.model.Author;
import com.devops.microservices.author.repository.AuthorRepository;

@Service
public class AuthorService {
	
    private final AuthorRepository authorRepo;

    public AuthorService(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    public Author addAuthor(Author author) {
        return authorRepo.save(author);
    }

    public Author updateAuthor(Long id, Author author) {
        author.setId(id);
        return authorRepo.save(author);
    }

    public void deleteAuthor(Long id) {
    	authorRepo.deleteById(id);
    }

}

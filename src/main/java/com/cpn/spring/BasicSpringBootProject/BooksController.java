package com.cpn.spring.BasicSpringBootProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1l, "Simple webservice springboot 1.1", "Cassio Nunes."));
    }
}

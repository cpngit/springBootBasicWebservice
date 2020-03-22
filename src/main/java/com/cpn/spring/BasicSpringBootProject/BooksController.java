package com.cpn.spring.RestController;

import java.util.Arrays;
import java.util.List;

import com.cpn.spring.BasicSpringBootProject.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1l, "Simple webservice springboot", "Cassio Nunes"));
    }
}

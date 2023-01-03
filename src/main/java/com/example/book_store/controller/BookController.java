package com.example.book_store.controller;

import com.example.book_store.domain.Book;
import com.example.book_store.service.implement.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/books")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/get-books")
    public List<Book> getBookList() {
        return bookService.getBooksList();
    }

    @PostMapping("/add-book")
    public Book addBook(@Valid @RequestBody Book book) {
        return bookService.saveBook(book);
    }

//    @PutMapping("/update/{id}")
//    public ResponseEntity updateTask(@PathVariable Long id) {
//        return taskService.updateTask(id);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity deleteTask(@PathVariable Long id) {
//        return taskService.deleteTask(id);
//    }
}

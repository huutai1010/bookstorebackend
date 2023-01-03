package com.example.book_store.service.proxy;

import com.example.book_store.domain.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookServiceProxy {
    List<Book> getBooksList();

    public Book saveBook(Book book);

    public ResponseEntity deleteBook(Long id);

    //public ResponseEntity updateBook(Long id);
}

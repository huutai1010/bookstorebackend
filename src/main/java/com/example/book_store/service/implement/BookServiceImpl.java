package com.example.book_store.service.implement;

import java.util.List;
import com.example.book_store.domain.Book;
import com.example.book_store.repository.BookRepository;
import com.example.book_store.service.proxy.BookServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookServiceProxy {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooksList() {
        return bookRepository.findAll();
    }
    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

//    @Override
//    public Book[] saveBook(Book[] books) {
//        return bookRepository.save(books);
//    }

    @Override
    public ResponseEntity deleteBook(Long id) {
        boolean exist = bookRepository.existsById(id);
        if (exist) {
            bookRepository.deleteById(id);
        }
        return new ResponseEntity<>("Task is deleted", HttpStatus.OK);
    }

//    @Override
//    public ResponseEntity updateBook(Long id) {
//        boolean exist = bookRepository.existsById(id);
//        if (exist) {
//            Book book = bookRepository.getReferenceById(id);
//            boolean done = book.isDone();
//            book.setDone(!done);
//            bookRepository.save(book);
//            return new ResponseEntity<>("Book is updated", HttpStatus.OK);
//        }
//        return new ResponseEntity<>("Book is not exist", HttpStatus.BAD_REQUEST);
//    }
}

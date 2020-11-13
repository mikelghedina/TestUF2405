package com.CifoJava2020.TestUF2405.Service;

import com.CifoJava2020.TestUF2405.Model.Book;
import com.CifoJava2020.TestUF2405.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public Iterable<Book> showBooks(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
        System.out.println(book+ " is saved successfully.");
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
        System.out.println(book + " has been removed from the DB.");
    }

    public Book findByTitle(String title){
        return bookRepository.findByTitle(title);
    }

}

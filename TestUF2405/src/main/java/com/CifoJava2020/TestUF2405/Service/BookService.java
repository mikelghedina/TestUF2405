package com.CifoJava2020.TestUF2405.Service;

import com.CifoJava2020.TestUF2405.Model.Book;
import com.CifoJava2020.TestUF2405.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//A service Class for Book Class to intermediate all the petitions from BookController. In this way we get loose-coupling
//to accomplish traceability in our app.
@Service
public class BookService {

    //inject BookRepository class to get all the methods it has.
    @Autowired
    BookRepository bookRepository;

    //Iterable method to get a list of all the book objects we have in our "BOOKS" table.
    public Iterable<Book> showBooks(){
        return bookRepository.findAll();
    }

    //Method to add a Book object in our DataBase.
    public void addBook(Book book){
        bookRepository.save(book);
        System.out.println(book+ " is saved successfully.");
    }
    //Method to delete a Book object in our DataBase.
    public void deleteBook(Book book) {
        bookRepository.delete(book);
        System.out.println(book + " has been removed from the DB.");
    }


}

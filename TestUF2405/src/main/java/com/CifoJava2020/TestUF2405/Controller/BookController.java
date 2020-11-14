package com.CifoJava2020.TestUF2405.Controller;


import com.CifoJava2020.TestUF2405.Model.Book;
import com.CifoJava2020.TestUF2405.Service.BookService;
import com.CifoJava2020.TestUF2405.Utils.Filling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//I use a specific and generic route to differentiate from QuoteController class and use all the service from the controller.
@RestController
@RequestMapping("/books")
public class BookController {

    //inject BookService Class.
    @Autowired
    BookService bookService;


    //Route to show the "BOOKS" table.
    @GetMapping("")
    public Iterable<Book> showBooks(){
        return bookService.showBooks();
    }

    //Route to add a Book in table "BOOKS".It directly fills 2 books that we created in Filling Class.
    //take a look in /Utils/Filling for more.We reuse returning showBooks method to show what we added.
    @GetMapping("/insertBook")
    public Iterable<Book> insertBook(){

        bookService.addBook(Filling.bookList().get(0));
        bookService.addBook(Filling.bookList().get(1));

        return showBooks();
    }

    //Route to delete a book from BOOKS table.
    @GetMapping("/deleteBook")
    public Iterable<Book> deleteQuote(){
        //bookService.deleteBook();
        //bookService.deleteBook();

        return showBooks();
    }
}

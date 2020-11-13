package com.CifoJava2020.TestUF2405.Controller;


import com.CifoJava2020.TestUF2405.Model.Book;
import com.CifoJava2020.TestUF2405.Service.BookService;
import com.CifoJava2020.TestUF2405.Utils.Filling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;


    @RequestMapping("")
    public Iterable<Book> showBooks(){
        return bookService.showBooks();
    }

    @RequestMapping("/insertBook")
    public Iterable<Book> insertBook(){

        bookService.addBook(Filling.bookList().get(0));
        bookService.addBook(Filling.bookList().get(1));

        return showBooks();
    }
    @GetMapping("/deleteBook")
    public Iterable<Book> deleteQuote(){
        //bookService.deleteBook();
        //bookService.deleteBook();

        return showBooks();
    }
}

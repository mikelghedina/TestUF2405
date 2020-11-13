package com.CifoJava2020.TestUF2405.Controller;

import com.CifoJava2020.TestUF2405.Model.Quote;
import com.CifoJava2020.TestUF2405.Service.BookService;
import com.CifoJava2020.TestUF2405.Service.QuoteService;
import com.CifoJava2020.TestUF2405.Utils.Filling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {


    @Autowired
    QuoteService quoteService;

    @Autowired
    BookService bookService;

    @GetMapping("")
    public Iterable<Quote> showQuotes(){
        return quoteService.showQuotes();
    }

    @GetMapping("/insertQuote")
    public Iterable<Quote> insertQuote(){
        quoteService.addQuote(new Quote("All happy families are alike; each unhappy family is unhappy in its own way",
                14,Filling.bookList().get(0)));
        quoteService.addQuote(new Quote("As long as she thinks of a man, nobody objects to a woman thinking",
                14,Filling.bookList().get(1)));

        return showQuotes();
    }

}

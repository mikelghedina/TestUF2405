package com.CifoJava2020.TestUF2405.Controller;

import com.CifoJava2020.TestUF2405.Model.Quote;
import com.CifoJava2020.TestUF2405.Service.BookService;
import com.CifoJava2020.TestUF2405.Service.QuoteService;
import com.CifoJava2020.TestUF2405.Utils.Filling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//I use a specific and generic route to differentiate from BookController class and use all the service from the controller.
@RestController
@RequestMapping("/quotes")
public class QuoteController {

    //Inject QuoteService Class.
    @Autowired
    QuoteService quoteService;

    //Route to show "QUOTES" table.
    @GetMapping("")
    public Iterable<Quote> showQuotes(){
        return quoteService.showQuotes();
    }

    //Route to add a Quote in table "QUOTES".It directly fills 2 quotes that we created in Filling Class.
    //take a look in /Utils/Filling for more. We reuse returning showQuotes method to show what we added.
    @GetMapping("/insertQuote")
    public Iterable<Quote> insertQuote(){
        quoteService.addQuote(Filling.quoteList().get(0));
        quoteService.addQuote(Filling.quoteList().get(1));

        return showQuotes();
    }

    //Route to delete a quote from "QUOTES" table.
    @GetMapping("/deleteQuote")
    public Iterable<Quote> deleteQuote(){
        //quoteService.deleteQuote();
        //quoteService.deleteQuote();

        return showQuotes();
    }

}

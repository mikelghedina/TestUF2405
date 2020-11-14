package com.CifoJava2020.TestUF2405.Service;

import com.CifoJava2020.TestUF2405.Model.Quote;
import com.CifoJava2020.TestUF2405.Repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    //inject BookRepository class to get all the methods it has.
    @Autowired
    QuoteRepository quoteRepository;

    //Iterable method to get a list of all the quote objects we have in our "QUOTES" table.
    public Iterable<Quote> showQuotes(){
        return quoteRepository.findAll();
    }

    //Method to add a Quote object in our DataBase.
    public void addQuote(Quote quote){
        quoteRepository.save(quote);
        System.out.println(quote + " inserted successfully.");
    }

    //Method to delete a Quote object in our DataBase.
    public void deleteQuote(Quote quote){
        quoteRepository.delete(quote);
        System.out.println(quote + " deleted successfully.");
    }
}

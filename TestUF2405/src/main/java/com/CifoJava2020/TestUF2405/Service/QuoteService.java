package com.CifoJava2020.TestUF2405.Service;

import com.CifoJava2020.TestUF2405.Model.Quote;
import com.CifoJava2020.TestUF2405.Repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    QuoteRepository quoteRepository;

    public Iterable<Quote> showQuotes(){
        return quoteRepository.findAll();
    }

    public void addQuote(Quote quote){
        quoteRepository.save(quote);
        System.out.println(quote + " inserted successfully.");
    }

    public void deleteQuote(Quote quote){
        quoteRepository.delete(quote);
        System.out.println(quote + " deleted successfully.");
    }
}

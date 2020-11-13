package com.CifoJava2020.TestUF2405.Utils;


import com.CifoJava2020.TestUF2405.Model.Book;
import com.CifoJava2020.TestUF2405.Model.Quote;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;


public class Filling {

    public static ArrayList<Book> bookList(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Anna Karerina"));
        books.add(new Book("Orlando"));
        return books;
    }
    public static ArrayList<Quote> quoteList(){
        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(new Quote("All happy families are alike; each unhappy family is unhappy in its own way",
                14,Filling.bookList().get(0)));
        quotes.add(new Quote("As long as she thinks of a man, nobody objects to a woman thinking",
                14,Filling.bookList().get(1)));
        return quotes;
    }

}

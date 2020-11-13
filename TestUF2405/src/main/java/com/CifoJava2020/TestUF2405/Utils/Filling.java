package com.CifoJava2020.TestUF2405.Utils;


import com.CifoJava2020.TestUF2405.Model.Book;

import java.util.ArrayList;

public class Filling {

    public static ArrayList<Book> bookList(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Anna Karerina"));
        books.add(new Book("Orlando"));
        return books;
    }

}

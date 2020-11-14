package com.CifoJava2020.TestUF2405.Repository;

import com.CifoJava2020.TestUF2405.Model.Book;
import org.springframework.data.repository.CrudRepository;

//Repository for Book class to connect all the request petitions from BookController>BookService>BookRepository to our H2 DB.
public interface BookRepository extends CrudRepository<Book, Long> {

}

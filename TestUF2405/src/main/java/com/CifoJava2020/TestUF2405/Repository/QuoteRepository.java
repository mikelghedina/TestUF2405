package com.CifoJava2020.TestUF2405.Repository;

import com.CifoJava2020.TestUF2405.Model.Quote;
import org.springframework.data.repository.CrudRepository;

//Repository for Quote class to connect all the request petitions from QuoteController>QuoteService>QuoteRepository to our H2 DB.
public interface QuoteRepository extends CrudRepository<Quote, Long> {
}

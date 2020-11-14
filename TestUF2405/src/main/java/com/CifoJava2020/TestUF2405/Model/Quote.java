package com.CifoJava2020.TestUF2405.Model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

//Quote Entity Class creating a ManyToOne relationship with quotes.
@Entity
@Table(name = "QUOTES")
@Getter @Setter @NoArgsConstructor @ToString
public class Quote  {

    //Generates an automatic ID for every quote created.
    @Id
    @GeneratedValue
    private Long id;

    private String tag;
    private String sentence;
    private int numberWords;

    @ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;


    public Quote(String sentence, int numberWords, Book book) {
        this.sentence = sentence;
        this.numberWords = numberWords;
        this.book = book;
    }
}

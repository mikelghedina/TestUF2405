package com.CifoJava2020.TestUF2405.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BOOKS")
@Getter @Setter @NoArgsConstructor @ToString
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Quote> quotes;

    public Book(String title, Set<Quote> quotes) {
        this.title = title;
        this.quotes = quotes;
    }

    public Book(String title) {
        this.title = title;
    }
}

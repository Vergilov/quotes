package com.vergilov.quotes.quotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class QuotesApplication {

    private List<String> quotes;


    public static void main(String[] args) {
        SpringApplication.run(QuotesApplication.class, args);
    }

}

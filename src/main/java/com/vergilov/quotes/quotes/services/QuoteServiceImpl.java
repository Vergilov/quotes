package com.vergilov.quotes.quotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class QuoteServiceImpl implements QuoteService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

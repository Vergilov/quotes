package com.vergilov.quotes.quotes.controllers;

import com.vergilov.quotes.quotes.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {
    private QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({"/",""})
    public String showQuote(Model model){

        model.addAttribute("quote",quoteService.getJoke());

        return "lifequote";

    }
}


package com.example.dev_quote_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private final List<String> quotes = List.of(
        "First, solve the problem. Then, write the code.",
        "Make it work, make it right, make it fast.",
        "Code is read more often than it is written.",
        "Simplicity is the soul of efficiency.",
        "Fix the cause, not the symptom."
    );

    @GetMapping("/quote")
    public String getQuote() {
        return quotes.get(new Random().nextInt(quotes.size()));
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}

package com.xxicon.poker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokerController {

    @GetMapping
    public String index() {
        return "Hi, Poker!";
    }

    @GetMapping("/test")
    public long test() {
        return System.currentTimeMillis();
    }
}

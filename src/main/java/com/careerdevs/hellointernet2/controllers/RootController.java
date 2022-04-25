package com.careerdevs.hellointernet2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    private String returnString () {
    return "requested the root route";
    }
}

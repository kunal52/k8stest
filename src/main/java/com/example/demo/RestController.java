package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping
    public String test()
    {
        return "Working " + new Date().toString();
    }

}

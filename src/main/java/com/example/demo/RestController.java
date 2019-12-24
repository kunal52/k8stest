package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("kube")
public class RestController {

    @GetMapping
    public String test()
    {
        return "Working " + new Date().toString();
    }

}

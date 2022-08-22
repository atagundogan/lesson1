package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    @GetMapping(path = "/message/{m}")
    public String getMyMessage(@PathVariable("m") String message)
    {
return "Your message is " + message;
    }
}

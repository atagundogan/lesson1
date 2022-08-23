package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    @GetMapping(path = "/message")
public String getMyMessage(@RequestParam String message)
    {
        return "Your message: " + message;
    }
    @GetMapping(path = "/required")
    public String getMyMessageRequired(@RequestParam(name ="message", required = false, defaultValue = "Sabit Mesaj")String message)
    {
        return "Your message: " + message;
    }
//    @GetMapping(path = "/message/{m}")
//    public String getMyMessage(@PathVariable("m") String message)
//    {
//return "Your message is " + message;
//    }
}

package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    // localhost:8081/hello
    // @GetMapping(path = "/hello")
    // GET Methodu Veri görüntülemek için kullanılır. @GetMapping
    // POST Methodu Veriyi Kaydetmek için kullanılır. @PostMapping
    // PUT Methodu Veriyi Güncellemek için kullanılır. @PutMapping
    // PATCH Methodu Verinin bir bölümünğ güncellemek için kullanılır. örneğin parola! @PatchMapping
    // DELETE Methodu ise veriyi silmek için kullanılır. @DeleteMapping

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World!..";
    }
    @PostMapping(path = "/save")
    public String save()
    {
        return "Save Data";
    }

    @DeleteMapping(path="/delete")
    public String delete()
    {
        return "Delete Data";
    }
}

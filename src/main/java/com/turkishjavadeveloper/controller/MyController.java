package com.turkishjavadeveloper.controller;

import com.turkishjavadeveloper.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    /// model içinde oluşturulan user class işlerimlerinden sonra burdan devam ediyoruz.
    @PostMapping("users")
    public User saveUser(@RequestBody User user)
    {
        System.out.println("User Saved!");
        user.setPassword("");  // güvenlik gereği password boş bi şekilde görünmesini sağladık.
        return user;
    }

    /// üstteki işlemi liste halinde yapmamız için aşağıdaki yol izlendi.

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users)
    {
        System.out.println("All Users Saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }

//    @GetMapping(path = "/message/{m}")
//    public String getMyMessage(@PathVariable("m") String message)
//    {
//return "Your message is " + message;
//    }
}

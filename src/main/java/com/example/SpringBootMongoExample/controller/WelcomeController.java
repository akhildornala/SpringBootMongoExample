package com.example.SpringBootMongoExample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    

    @GetMapping("/hi/{name}")
    public String welcome(@PathVariable String name) {
        return "welcome " + name;

    }


    @GetMapping("/test/{name}")
    public String test(@PathVariable String name, @RequestParam("gender") String gender) {
        return "test 1 " + name + " is " + gender;
     
    }

}

package com.springcourse.springboot.controller;

import com.springcourse.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String welcome(){
        return "Welcome Ashok!!";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Ashok");
        user.setEmailId("ash@gmail.com");

        return user;
    }

    @GetMapping("/user/{id}/{name}")
    public String pathVarTest(@PathVariable String id,
                              @PathVariable String name){
        return "The id is " + id +"and the name is "+ name;
    }
}

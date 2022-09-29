package com.bomed.sprint4.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/users")
    public String users(){
        return "users";
    }

    @GetMapping("/createUser")
    public String createUser(){
        return "createUser";
    }
}
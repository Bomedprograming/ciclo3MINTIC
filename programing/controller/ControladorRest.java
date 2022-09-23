package com.bomed.programing.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Hola";
    }

    @GetMapping("/about")
    public String presentar(){
        return "Holis";
    }
}

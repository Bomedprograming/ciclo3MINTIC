package com.bomed.programing;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorGerneral {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String>saludar(){
        return new ResponseEntity<>( "agasgahhfg Hola", HttpStatus.OK);
    }


}

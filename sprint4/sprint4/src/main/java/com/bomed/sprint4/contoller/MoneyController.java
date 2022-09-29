package com.bomed.sprint4.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MoneyController {

    @GetMapping("/money")
    public String money(){
        return "money";
    }

    @GetMapping("/transaction")
    public String transaction(){
        return "transaction";
    }
}


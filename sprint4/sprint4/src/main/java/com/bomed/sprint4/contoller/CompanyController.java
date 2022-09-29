package com.bomed.sprint4.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

    @GetMapping("/company")
    public String company(){
        return "company";
    }

    @GetMapping("/createCompany")
    public String createCompany(){
        return "createCompany";
    }

}

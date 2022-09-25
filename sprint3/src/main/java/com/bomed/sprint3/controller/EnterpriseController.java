package com.bomed.sprint3.controller;


import com.bomed.sprint3.services.IServiceEnterprise;
import com.bomed.sprint3.entity.Enterprise;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController

public class EnterpriseController {
    private IServiceEnterprise services;

    public EnterpriseController(IServiceEnterprise services) {
        this.services = services;
    }


    @GetMapping("/enterprises")
    public ArrayList<Enterprise> listEnterprise(){
        return this.services.listEnterprise();
    }

    @GetMapping("/enterprises/{id}")
    public Optional<Enterprise> searchEnterprise(@PathVariable("id") Long id){
        return this.services.searchEnterprise(id);
    }

    @PostMapping("enterprises")
    public String createEnterprise(@RequestBody Enterprise enterprise){
        return this.services.createEnterprise(enterprise);
    }

    @PatchMapping("/enterprises/{id}")
    public Enterprise updateEnterprise(@PathVariable("id") Long id, @RequestBody Map<Object,Object> EnterpriseMap){
        return this.services.updateEnterprise(id, EnterpriseMap);
    }

    @DeleteMapping("enterprises/{id}")
    public String deleteEnterprise(@PathVariable Long id){
        return this.services.deleteEnterprise(id);
    }

}

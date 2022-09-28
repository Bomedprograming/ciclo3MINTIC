package com.bomed.sprint3.controller;

import com.bomed.sprint3.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@Controller
public class FrontControllers {

    @GetMapping("/")
    public String Index (){
        return "index";
    }

    @RestController
    public static class TransactionController {
        private TransactionController services;

        @Autowired
        public TransactionController(@Lazy TransactionController services) {
            this.services = services;
        }

        @GetMapping("/enterprises/{id}/movements")
        public Set<Transaction> listTransaction(@PathVariable("id") Long id){
            return this.services.listTransaction(id);
        }

        @GetMapping("/enterprises/{id}/movements/{index}")
        public Transaction searchTransaction(@PathVariable("id") Long id, @PathVariable("index") Integer index){
            return this.services.searchTransaction(id,index);
        }

        @PostMapping("/enterprises/{id}/movements")
        public String createTransaction(@RequestBody Transaction x, @PathVariable("id") Long id){
            return  this.services.createTransaction(x, id);
        }

        @PatchMapping("/enterprises/movements/{id}")
        public Transaction updateTransaction(@PathVariable("id")int id, @RequestBody Map<Object,Object> TransactionMap){
            return  this.services.updateTransaction(id,TransactionMap);
        }

        @DeleteMapping("/enterprises/{id}/movements/{index}")
        public  String deleteTransaction(@PathVariable("id") Long id, @PathVariable("index") Long index){
            return this.services.deleteTransaction(index, id);
        }

    }
}

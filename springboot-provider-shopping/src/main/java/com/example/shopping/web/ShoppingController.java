package com.example.shopping.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {


    @GetMapping("/api/go/shopping/by/id")
    String goShoppingById(@RequestParam("id")Long id){
        int a=5;
        int c=a/0;
        return "调用成功了！";
    }


}

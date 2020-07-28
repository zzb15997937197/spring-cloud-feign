package com.example.shopping.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {


    @GetMapping("/api/go/shopping/by/id")
    String goShoppingById(@RequestParam("id")Long id){
        while (true){
//            int a=5;
//            int c=a/0;
//            if (1==1){
//                return "完成";
//            }
        }
    }


}

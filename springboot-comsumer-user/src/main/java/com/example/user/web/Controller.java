package com.example.user.web;


import com.example.user.userInterface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    private UserInterface userInterface;

    @GetMapping("/test")
    public void testFeign01(){
        Long id=1L;
       String result=  userInterface.goShoppingById(id);
       System.out.println("result="+result);
    }
}

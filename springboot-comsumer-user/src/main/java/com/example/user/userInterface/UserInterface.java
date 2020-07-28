package com.example.user.userInterface;

import com.example.user.hystrixUtil.UserInterfaceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PROVIDER-SHOPPING",fallback = UserInterfaceHystrix.class)
public interface UserInterface {


    @GetMapping("/api/go/shopping/by/id")
     String goShoppingById(@RequestParam("id")Long id);

}

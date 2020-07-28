package com.example.user.hystrixUtil;


import com.example.user.userInterface.UserInterface;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Slf4j
public class UserInterfaceHystrix implements UserInterface {

    Logger logger=LoggerFactory.getLogger(UserInterfaceHystrix.class);

    @Override
    public String goShoppingById(@RequestParam("id")Long id) {
        logger.debug("出错了，断路器hystrix回调成功!");
        return "eroor";
    }
}

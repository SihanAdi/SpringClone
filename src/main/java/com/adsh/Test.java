package com.adsh;
import com.adsh.service.UserService;
import com.adsh.service.UserServiceImpl;
import com.spring.AdshApplicationContext;

public class Test {
    public static void main(String[] args){
        AdshApplicationContext ApplicationContext = new AdshApplicationContext(AppConfig.class);

        UserService userService = (UserService) ApplicationContext.getBean("userService");
        userService.test();



    }
}

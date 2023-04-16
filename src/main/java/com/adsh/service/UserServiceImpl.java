package com.adsh.service;

import com.spring.*;

@Component("userService")
//@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderService orderService;


    private String beanName;

    private String name;

    public void test(){
        System.out.println(orderService);
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }


}

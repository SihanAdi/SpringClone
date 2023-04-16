package com.adsh.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class adshBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Before Initialization");
        if (beanName.equals("userService")){
//            ((UserServiceImpl)bean).setName("ad");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("After Initialization");

        //AOP
        if (beanName.equals("userService")){
            Object proxyInstance = Proxy.newProxyInstance(adshBeanPostProcessor.class.getClassLoader(),
                    bean.getClass().getInterfaces(), new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("Proxy logic");
                            return method.invoke(bean, args);
                        }
                    });

            return proxyInstance;
        }
        return bean;
    }
}

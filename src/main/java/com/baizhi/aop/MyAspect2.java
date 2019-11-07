package com.baizhi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-8)
public class MyAspect2 {

    @Before("execution(* com.baizhi.service..*.register(String,..))")   //前置通知的注解
    public void before(JoinPoint joinPoint) {
        System.out.println("我是运行在原始方法之前执行的额外功能22222222222222222");
    }
}

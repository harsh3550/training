package com.springcore;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdvisor {

    @Before("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("additional concern (Advertisement) before actual logic");
    }

}


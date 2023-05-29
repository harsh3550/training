package com.springcore;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AfterAdvisor {
    @After("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("additional concern after (finally) advice");
    }
    @AfterReturning("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logAfterReturning(JoinPoint joinPoint) {
        System.out.println("additional concern after returning(vouchers) advice");
    }
    @AfterThrowing("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logAfterThrowing(JoinPoint joinPoint) {
        System.out.println("additional concern if exception (send away customers) occurs");
    }
}



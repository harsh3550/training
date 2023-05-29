package com.springcore;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AroundAdvisor {
    @Around("execution(* com.springcore.Restaurant.greetCustomer(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("additional concern around before actual (take order) logic");
        joinPoint.proceed();
        System.out.println("additional concern around after actual (bill) logic");
    }
}

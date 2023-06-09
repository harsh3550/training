package com.springcore;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
public class AfterAdvisor implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object returnValue, Method method,   Object[] args, Object target) throws Throwable {
        System.out.println("additional concern (Vouchers for next order) after returning advice");
    }
}

package com.springcore;

import org.springframework.aop.ThrowsAdvice;
public class ThrowsAdvisor implements ThrowsAdvice{
    public void afterThrowing(Exception ex){
        System.out.println("additional concern (no booking ID: No entertainment: Send customer back ) if exception occurs");
    }
}



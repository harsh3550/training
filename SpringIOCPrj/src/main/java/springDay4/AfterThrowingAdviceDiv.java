package springDay4;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

public class AfterThrowingAdviceDiv {
    @AfterThrowing("execution(* springDay4.Calculator.divide(..))")
    public void afterThrowing(JoinPoint joinPoint) {
        Logger log = LogManager.getLogger(AfterAdviceAdd.class);
        log.info("After Throwing.......");
    }
}
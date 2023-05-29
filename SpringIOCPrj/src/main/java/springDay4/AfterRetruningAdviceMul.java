package springDay4;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
public class AfterRetruningAdviceMul {
    @AfterReturning("execution(* springDay4.Calculator.multiply(..))")
    public void logAfterReturning(JoinPoint joinPoint){
        Logger log = LogManager.getLogger(AfterRetruningAdviceMul.class);
        log.info("Multiplication....");
    }
}
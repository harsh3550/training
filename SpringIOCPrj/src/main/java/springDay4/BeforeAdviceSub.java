package springDay4;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class BeforeAdviceSub {
    @Before("execution(* springDay4.Calculator.subtract(..))")
    public void logBefore(JoinPoint joinPoint){
         Logger log = LogManager.getLogger(BeforeAdviceSub.class);
         log.info("Subtraction...");
    }
}

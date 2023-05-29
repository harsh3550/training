package springDay4;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAdviceAdd {
    @After("execution(* springDay4.Calculator.add(..))")
    public void logAfter(JoinPoint joinPoint){
        Logger log = LogManager.getLogger(AfterAdviceAdd.class);
        log.info("Addition....");
    }
}
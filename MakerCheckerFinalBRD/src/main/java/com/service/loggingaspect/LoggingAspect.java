package com.service.loggingaspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect{
    private Logger logger = LogManager.getLogger();

    @Around("@annotation(com.service.loggingaspect..*.*(.. )))")
    public Object Logging(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = jp.proceed();
        long end = System.currentTimeMillis();
        logger.info("Time taken to execute " + jp.getSignature().getName() + "is: " + (end - start) + " ms");
        return obj;
    }
}

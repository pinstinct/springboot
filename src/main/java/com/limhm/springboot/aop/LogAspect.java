package com.limhm.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    /*
    * AOP
    * https://www.baeldung.com/spring-aop
    * https://www.baeldung.com/spring-aop-annotation
    * https://jeong-pro.tistory.com/171
    * */
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Around("execution(* com.limhm.springboot..*.*(..))")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("start - " + joinPoint.getSignature().getDeclaringTypeName() + " / " +
                joinPoint.getSignature().getName());

        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;

        logger.info("finished - " + joinPoint.getSignature().getDeclaringTypeName() + " / " +
                joinPoint.getSignature().getName() + " executed in " + executionTime + "ms");

        return proceed;
    }
}

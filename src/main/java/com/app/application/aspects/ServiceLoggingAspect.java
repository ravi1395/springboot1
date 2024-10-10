package com.app.application.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceLoggingAspect {
    Logger log = LoggerFactory.getLogger(ServiceLoggingAspect.class);

    @Pointcut("execution(* com.app.application.service.*.* (..))")
    public void logServiceMethods() {}

    @Before("logServiceMethods()")
    public void logBeforeServiceCall(JoinPoint joinPoint){
        log.info("Service being called, method is {}",joinPoint.getSignature());
    }

    @After("logServiceMethods()")
    public void afterLogServiceCall(JoinPoint joinPoint){
        log.info("after Service call {}",joinPoint.getSignature());
    }

    @Around("logServiceMethods()")
    public Object example(ProceedingJoinPoint joinPoint){
        Object returnValue = joinPoint.proceed();
        return returnValue;
    }
}


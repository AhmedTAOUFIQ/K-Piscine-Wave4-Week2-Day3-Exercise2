package com.example.spring.aop.aspects;
import com.example.spring.aop.annotations.TimeIt;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeItAspect {
    @Pointcut("@annotation(com.example.spring.aop.annotations.TimeIt)")
    public void annotatedMethods() {
    }

    @Around("annotatedMethods()")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Method " + joinPoint.getSignature().toShortString() + " executed in " + executionTime + " ms");
        return result;
    }
}

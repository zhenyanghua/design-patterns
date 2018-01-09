package com.leafyjava.tutorials.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class GamePlayAspect {

    @Before("execution(void com.leafyjava..*.set*(..))")
    public void callSetters(JoinPoint joinPoint) {
        System.out.println("Setters called - " + joinPoint.getTarget().getClass().getSimpleName() + " - " +
            Arrays.toString(joinPoint.getArgs()));
    }
}

package com.powernode.sb3010aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Aspect
public class LogAspect {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");
    @Before("execution(* com.powernode.sb3010aop.service..*.*(..))")
    public void sysLog(JoinPoint joinPoint)throws Throwable{
        StringBuilder log=new StringBuilder();
        LocalDateTime now=LocalDateTime.now();
        String strNow= formatter.format(now);
        log.append(strNow);
        log.append(":");
        log.append(joinPoint.getSignature().getName());
        log.append("(");
        Object[] args= joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            log.append(args[i]);
            if(i<args.length-1){
                log.append(",");
            }
        }
        log.append(")");
        System.out.println(log);
    }
}

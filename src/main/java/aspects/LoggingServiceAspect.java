package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingServiceAspect {
    @Before("execution(* *.LoggingService.*(..))")
    public void beforePrint(JoinPoint joinPoint){
        System.out.println("This is logged before calling the method: " + joinPoint.getSignature());
    }

    @After("execution(int *.LoggingService.*(..))")
    public void afterPrint(JoinPoint joinPoint){
        System.out.println("This is logged after calling int methods");
    }

    @AfterReturning(pointcut = "execution(int *.LoggingService.*(..))", returning = "age")
    public void afterReturning(int age){
        System.out.println("Your age is: " + age);
    }

    @AfterThrowing(pointcut = "execution(int *.LoggingService.*(..))")
    public void afterThrowing(){
        System.out.println("There was an error with the reading of the input");
    }
}

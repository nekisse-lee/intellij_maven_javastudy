package main;

import chap07.Calculator;
import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);


        Calculator recCalculator = ctx.getBean("recCalculator",Calculator.class );
//        Calculator cal1 = (Calculator) ctx.getBean("calculator");


        long fiveFact = recCalculator.factorial(5);
        System.out.println("recCalculator.factorial(5) = " + fiveFact);
        System.out.println(recCalculator.getClass().getName());

        ctx.close();
    }
}

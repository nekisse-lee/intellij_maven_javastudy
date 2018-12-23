package main;

import chap007.Calculator;
import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);
        long fiveFact = cal.factorial(5);
        System.out.println("cal.factorial(5) = " + fiveFact );
        System.out.println(cal.getClass().getName());
        ctx.close();

    }
}

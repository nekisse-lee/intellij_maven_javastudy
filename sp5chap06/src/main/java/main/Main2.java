package main;

import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.Client;
import spring.Client2;

public class Main2 {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Client bean1 = ctx.getBean(Client.class);
        Client bean2 = ctx.getBean(Client.class);

        Client2 bean3 = ctx.getBean(Client2.class);
        Client2 bean4 = ctx.getBean(Client2.class);

        System.out.println("bean1 == bean2 = " + (bean1 == bean2));

        System.out.println("bean3 == bean4 = " + (bean3 == bean4));
    }
}

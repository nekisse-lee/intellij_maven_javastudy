package main;

import config.AppCtxWithPrototype;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.Client;
import spring.Client2;

public class MainForPrototype {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithPrototype.class);


        Client client = ctx.getBean(Client.class);
        Client client1 = ctx.getBean(Client.class);

        Client2 bean = ctx.getBean("client2",Client2.class);
        Client2 bean1 = ctx.getBean("client2",Client2.class);
        System.out.println("bean==bean1 =  " + (bean==bean1));


        client.send();

        client1.send();

        System.out.println(client==client1);


//        bean.send();
        ctx.close();

    }


}

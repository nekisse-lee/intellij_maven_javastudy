package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Scope;
import spring.*;

@Configuration
@ComponentScan(basePackages = "spring")
public class AppCtx {


    @Bean(initMethod = "connect", destroyMethod = "close" )
    @Scope("prototype")
    public Client2 client2() {
        Client2 client2 = new Client2();
        client2.setHost("host2");
        return client2;
    }


    /*@Bean(destroyMethod = "close")
    public Client2 client2() {
        Client2 client2 = new Client2();

        client2.setHost("host2");
        client2.connect();
        return client2;
    }*/



    @Bean
//    @Qualifier("client")
    public Client client() {
        return new Client();
    }

}

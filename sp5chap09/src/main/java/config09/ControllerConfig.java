package config09;

import chap09.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="chap09")
public class ControllerConfig {

    @Bean
    public HelloController helloController() {
        return new HelloController();
    }

}

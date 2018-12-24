package config;

import aspect.CacheAspect;
import aspect.ExeTimeAspect;
import chap007.Calculator;
import chap007.ExeTimeCalculator;
import chap007.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {/*"aspect",*/ "chap007"})
public class AppCtx {
    @Bean
    @Order(2)
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }

    @Bean
    @Order(1)
    public CacheAspect cacheAspect() {
        return new CacheAspect();
    }
    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }




}

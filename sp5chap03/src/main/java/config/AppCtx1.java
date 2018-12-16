package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.*;

@Configuration
public class AppCtx1 {


    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }



    @Bean
    public MemberPrinter memberPrinter() {
        return  new MemberPrinter();
    }


}

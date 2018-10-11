package web.config;

import hu.iit.service.BasicCalculator;
import hu.iit.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorAplicationMethocContext {

    @Bean
    public Calculator calculator(){
        return new BasicCalculator();
    }

    @Bean
    public String helloWorld(){
        return "hello world";
    }

}

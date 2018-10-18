package web.config;

import hu.iit.controller.CalculatorController;
import hu.iit.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan({"web.config", "hu.iit.controller"})
@PropertySource("classpath:web.properties")
public class CalculatorApplicationContext {

    @Value("${calc.defaultValue}")
    private double defaultValue;


    @Autowired Calculator calculator;

    @Bean
    public CalculatorController calculatorController(){
        System.out.println(defaultValue);
        return new CalculatorController(calculator);
    }


}

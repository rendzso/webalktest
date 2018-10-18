package web.config;

import hu.iit.controller.CalculatorController;
import hu.iit.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"web.config", "hu.iit.controller"})
public class CalculatorApplicationContext {

    @Autowired Calculator calculator;

    @Bean
    public CalculatorController calculatorController(){
        return new CalculatorController(calculator);
    }


}

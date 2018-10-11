package web.config;

import hu.iit.CalculatorController;
import hu.iit.service.BasicCalculator;
import hu.iit.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CalculatorApplicationContext {

    @Autowired Calculator calculator;

    @Bean
    public CalculatorController calculatorController(){
        return new CalculatorController(calculator);
    }


}

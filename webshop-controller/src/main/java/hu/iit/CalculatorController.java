package hu.iit;

import hu.iit.service.Calculator;

public class CalculatorController {

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public double add(double a, double b){
        return calculator.add(a, b);
    }



}

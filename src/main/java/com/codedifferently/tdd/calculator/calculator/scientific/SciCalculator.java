package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;


import static java.lang.Math.*;

public class SciCalculator extends BasicCalculatorImp {


    public Memory memory;
    private Double input;

    public SciCalculator(){
        super();
    }
    /**
     * Add your constructor code here
     */

    protected Double sine(Double input){
        Double degCurrentValue = memory.recallCurrentValue();
        //Boolean displayMode = DisplayMode.BINARY();
        degCurrentValue = sin(degCurrentValue);
        return degCurrentValue;
    }

    protected Double cosine(){
        Double degCurrentValue = memory.recallCurrentValue();
        degCurrentValue = cos(degCurrentValue);
        return degCurrentValue;
    }


    protected Double tangent(){
        Double currentValue = memory.recallCurrentValue();
        currentValue = tan(currentValue);
        return currentValue;
    }


    protected Double inverseSine(Double input) {
        Double currentValue = memory.recallCurrentValue();
        input = 1.0;
        currentValue = Math.asin(input);
        /*if (input == 0) {
            throw new IllegalArgumentException("Argument divisor is 0");
        } */
        //currentValue = inverseSine(currentValue);
        return currentValue;
    }


    protected Double inverseCosine(Double input){
        Double currentValue = memory.recallCurrentValue();
        currentValue = Math.acos(input);
       // currentValue = inverseCosine(input);

        return currentValue;
    }


    protected Double inverseTangent(Double input){
        Double currentValue = memory.recallCurrentValue();
        currentValue = inverseTangent(currentValue);
        return currentValue;
    }


    protected Double factorial(Double input){
        Double currentValue = memory.recallCurrentValue();
        Double factorial = 1.0;
        Double i;
       // Double currentValue = 0.0;
        for(i = 2.0; i <= input; i += 1.0) {
            factorial *= i;
            currentValue = factorial;
        }
        return currentValue;
    }


    protected String switchUnitsMode(String input){
        return null;
    }


    protected Double log(Double input){
        Double currentValue = memory.recallCurrentValue();
        currentValue = log(input);
        return currentValue;
    }


    protected Double inverseLog(Double input){
        return null;
    }


    protected Double naturalLog(Double input){
        return null;
    }


    protected Double inverseNaturalLog(Double input){
        return null;
    }


    protected Double inverse(Double input){
        //Double currentValue = memory.recallCurrentValue();
        //currentValue = input;
        double number = input;
        double invResult = 1.0/number;
        return invResult;
    }


    protected Double switchSign(Double input){
        return null;
    }


    protected Double radToDegrees(){
        //Double currentValue = memory.recallCurrentValue();
        double radians = Math.PI;
        double currentValue = Math.toDegrees(radians);

        return currentValue;
    }

    protected Double degToRadians(){
        //Double currentValue = memory.recallCurrentValue();
        double degrees = 180;
        double currentValue = Math.toRadians(degrees);

        return currentValue;
    }

}

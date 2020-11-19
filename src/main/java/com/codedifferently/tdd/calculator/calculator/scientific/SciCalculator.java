package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;

import static java.lang.Math.*;

public class SciCalculator extends BasicCalculatorImp {


    private Double input;

    public SciCalculator(){
        super();
    }
    /**
     * Add your constructor code here
     */

    protected Double sine(){
        Double currentValue = memory.recallCurrentValue();
        currentValue = sin(currentValue);
       /* if (input == 0) {
            throw new IllegalArgumentException("Argument divisor is 0");
        }*/
        return currentValue;
    }
    protected Double cosine(){
        Double currentValue = memory.recallCurrentValue();
        currentValue = cos(currentValue);
        return currentValue;
    }
    protected Double tangent(){
        Double currentValue = memory.recallCurrentValue();
        currentValue = tan(currentValue);
        return currentValue;
    }
    protected Double inverseSine(){
        Double currentValue = memory.recallCurrentValue();
        currentValue = inverseSine();

        return currentValue;
    }
    protected Double inverseCosine(){
        Double currentValue = memory.recallCurrentValue();
        currentValue = inverseCosine();

        return currentValue;
    }
    protected Double inverseTangent(Double input){
        Double currentValue = memory.recallCurrentValue();
        currentValue = inverseTangent(input);
        return currentValue;
    }
    protected Integer factorial(Integer input){
        return null;
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
        double number = input;
        double invResult = 1.0/number;
        return invResult;
    }

    protected Double switchSign(Double input){
        return null;
    }



}

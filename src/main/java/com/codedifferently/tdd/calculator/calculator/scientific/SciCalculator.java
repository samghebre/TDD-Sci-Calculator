package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;


import static java.lang.Math.*;

public class SciCalculator extends BasicCalculatorImp {


    public Memory memory;
    //private Double input;

    public SciCalculator(){
        super();
        memory = new MemoryImplementation();
    }
    /**
     * Add your constructor code here
     */

    protected Double sine(Double input){
        Double sinValue = Math.sin(input);
        return sinValue;
    }

    protected Double cosine(Double input){
        Double cosValue = Math.cos(input);
        return cosValue;
    }


    protected Double tangent(Double input){
        Double tanValue = tan(input);
        return tanValue;
    }


    protected Double inverseSine(Double input) {
        Double invSinValue = Math.asin(input);
        return invSinValue;
    }


    protected Double inverseCosine(Double input){
         Double invCosValue = Math.acos(input);
         return invCosValue;
    }


    protected Double inverseTangent(Double input){
        Double invTanValue = Math.atan(input);
        return invTanValue;
    }


    protected Double factorial(Double input){
        Double factorial = 1.0;
        Double i;
        Double factNum = 0.0;
        for(i = 2.0; i <= input; i += 1.0) {
            factorial *= i;
            factNum = factorial;
        }
        return factNum;
    }


    protected Double log(Double input){
        Double logValue = Math.log10(input);
        return logValue;
    }


    protected Double inverseLog(Double input){
        Double invLogValue = Math.pow(input,2);
        return invLogValue;
    }


    protected Double naturalLog(Double input){
        Double naturalLogValue = Math.log(input);
        return naturalLogValue;
    }


    protected Double inverseNaturalLog(Double input){
        Double invNatLogValue = exp(input);
        return invNatLogValue;
    }


    protected Double inverse(Double input){
        Double number = input;
        Double invResult = 1.0/number;
        return invResult;
    }


    protected Double switchSign(Double input){
        Double numToSwitch = input;
        numToSwitch *= -1;
        return numToSwitch;
    }


    protected Double radToDegrees(Double input){
        Double numberValue = Math.toDegrees(input);
        return numberValue;
    }

    protected Double degToRad(Double input){
        Double numberValue = Math.toRadians(input);
        return numberValue;
    }

}

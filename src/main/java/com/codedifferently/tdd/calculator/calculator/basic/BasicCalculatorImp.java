package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;


public class BasicCalculatorImp implements Calculator{
    protected Memory memory;

    public BasicCalculatorImp(){
        this.memory = new MemoryImplementation();
    }

    public void run(){
        String message = "";
        System.out.println("Welcome to TDD Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
        System.out.println(message);
    }

    protected Double add(Double input){
        Double sum = input + memory.recallCurrentValue();
        memory.setCurrentValue(sum);
        return sum;
    }

    protected Double subtract(Double input){
        Double sub = memory.recallCurrentValue() - input;
        memory.setCurrentValue(sub);
        return sub;
    }

    protected Double multiply(Double input){
        Double mul = input * memory.recallCurrentValue();
        memory.setCurrentValue(mul);
        return mul;
    }

    protected Double divide(Double input){
        Double div = memory.recallCurrentValue() / input;
        memory.setCurrentValue(div);
        return div;
    }

    protected Double sq(Double input){
        return Math.pow(input, 2);
    }

    protected Double sqrt(Double input) {
        return Math.sqrt(input);
    }
}

package com.codedifferently.tdd.calculator.calculator.memory;

public interface Memory {
    void setToCurrentValue(Double input);
    void resetMemory();
    Double recallCurrentValue();
}

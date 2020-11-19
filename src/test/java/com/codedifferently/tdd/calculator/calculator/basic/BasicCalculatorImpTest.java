package com.codedifferently.tdd.calculator.calculator.basic;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorImpTest {

    @Test
    public void testAdd(){
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);
        //When
        Double expected = 8.0;
        Double actual = basicCalculatorImp.add(3.0);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSubtract() {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        // When
        Double expected = 2.0;
        Double actual = basicCalculatorImp.subtract(3.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testMultiply() {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        // When
        Double expected = 10.0;
        Double actual = basicCalculatorImp.multiply(2.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testDivide() {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(10.0);

        // When
        Double expected = 5.0;
        Double actual = basicCalculatorImp.divide(2.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSquare() {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(10.0);

        // When
        Double expected = 100.0;
        Double actual = basicCalculatorImp.sq(10.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSqrt() {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(100.0);

        // When
        Double expected = 10.0;
        Double actual = basicCalculatorImp.sqrt(100.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}


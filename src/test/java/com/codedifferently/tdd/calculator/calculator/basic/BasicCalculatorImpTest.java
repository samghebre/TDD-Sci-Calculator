package com.codedifferently.tdd.calculator.calculator.basic;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

public class BasicCalculatorImpTest {

    @Test
    public void testadd() throws Exception {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setToCurrentValue(5.0);

        //When
        Double expected = 8.0;
        Double actual = basicCalculatorImp.add(3.0);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}
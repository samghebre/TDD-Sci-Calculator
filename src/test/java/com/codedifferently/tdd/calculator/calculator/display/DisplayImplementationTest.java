package com.codedifferently.tdd.calculator.calculator.display;
import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.basic.Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayImplementationTest {




    //todo:
    // Test 1: Get returned the value of the next enum item

    // Given
    // * DECIMAL is the current DisplayMode

    // When
    // * we call the method "switchDisplayMode()"

    // Then
    // * we should get back the next value in enum array

    //todo:
    // Test 2: Change the DisplayMode to the next item in the enum array

    // Given
    // * DECIMAL is the current DisplayMode

    // When
    // * we call the method "switchDisplayMode()"

    // Then
    // We should

    //todo - implement test showing mode passed,
    // and result accurate
    // `switchDisplayMode(String mode)` should set the display to the mode given

    //todo implement test return the current display mode
    @Test
    public void testGetCurrentDisplayMode() {
        // Given
        //String expected = "DECIMAL";
        Calculator calculator = new BasicCalculatorImp();
        DisplayMode expected = DisplayMode.DECIMAL;
        // When
        // * we call the method
        String actual = DisplayImplementation.getCurrentDisplayMode();

        // Then
        // * we should get back the display mode DECIMAL
        Assert.assertEquals(expected, actual);


    }



}
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

    // `switchDisplayMode(String mode)` should set the display to the mode given
    @Test
    public void testSwitchDisplayModeByInput() {
        // Given
        Display display = new DisplayImplementation();
        DisplayMode expected = DisplayMode.HEXADECIMAL;
        // When
        DisplayMode actual = display.switchDisplayMode("HEXADECIMAL");
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetCurrentDisplayMode() {
        // Given
        Display display = new DisplayImplementation();
        DisplayMode expected = DisplayMode.DECIMAL;

        // When
        DisplayMode actual = display.getCurrentDisplayMode();

        // Then
        Assert.assertEquals(expected, actual);

    }



}
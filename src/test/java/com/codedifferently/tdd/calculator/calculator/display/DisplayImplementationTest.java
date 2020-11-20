package com.codedifferently.tdd.calculator.calculator.display;
// import org.junit.Before;

import org.junit.Assert;
import org.junit.Test;

public class DisplayImplementationTest {


    //todo:
    // Test : Change the DisplayMode to the next item in the enum array

    // Given
    // * DECIMAL is the current DisplayMode

    // When
    // * we call the method "switchDisplayMode()"

    // Then
    // We should


    @Test
    public void testSwitchDisplayModeByInput() {
        // Given
        Display display = new DisplayImplementation();
        DisplayMode expected = DisplayMode.BINARY;
        // When
        DisplayMode actual = display.switchDisplayMode("binary");
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
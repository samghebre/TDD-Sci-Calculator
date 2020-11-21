package com.codedifferently.tdd.calculator.calculator.display;

import org.junit.Assert;
import org.junit.Test;

public class DisplayImplementationTest {

    @Test
    public void testSwitchDisplayModeCycle() {
         // Given
        Display display = new DisplayImplementation();
        DisplayMode expected = DisplayMode.HEXADECIMAL;

        // When
        DisplayMode actual = display.switchDisplayMode();
        // Then
        Assert.assertEquals(expected, actual);
    }

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
package com.codedifferently.tdd.calculator.calculator.console;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomConsoleTest {

    public CustomConsole customConsole;

    @Before
    public void init() {
        customConsole = new CustomConsole();
    }

    @Test
    public void getStringInputTest() {
        // : Given
        String expected = "";
        String message = "Waiting for input ...";

        // : When
        String actual = customConsole.getStringInput(message);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIntegerInputTest() {
        // : Given
        Integer expected = 0;
        String message = "Waiting for whole number ...";

        // : When
        Integer actual = customConsole.getIntegerInput(message);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDoubleInput() {
        // : Given
        Double expected = 0.0;
        String message = "Waiting for decimal number ...";

        // : When
        Double actual = customConsole.getDoubleInput(message);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
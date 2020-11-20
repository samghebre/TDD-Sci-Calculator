package com.codedifferently.tdd.calculator.calculator.scientific;


import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {
    SciCalculator sciCalculator = new SciCalculator();
    Double input = 30.0;

    @Test
    public void testSineDeg() {
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.memory.setCurrentValue(input);
        Double input = 30.0;
        //Given
        //expected =
        Double expected = -0.9890316241;

        //When
        Double actual = sciCalculator.sine(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCosine() {
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.memory.setCurrentValue(input);
        input = 30.0;
        //Given
        //expected = 0.8660254038
        Double expected = 0.1542514499;

        //When
        Double actual = sciCalculator.cosine();

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTangent() {
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.memory.setCurrentValue(input);
        input = 30.0;
        //Given
        //expected = 0.8660254038
        Double expected = Math.tan(input);

        //When
        Double actual = sciCalculator.tangent();

        //Then
        Assert.assertEquals(expected, actual);
    }

   /* @Test
    public void testRadianDegrees() {
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.memory.setCurrentValue(input);
        //Given
        //expected
        Double expected = Math.toRadians(input);

        //When
        //Double actual = sciCalculator.toRadians();

        //Then
        //Assert.assertEquals(expected, actual);
    } */

    @Test
    public void testInverse() {
        //Given 5
        //expected 1/5
        Double expected = 1 / input;

        //When
        Double actual = sciCalculator.inverse(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseSineTest() {
        //Given
        //expected 1/sin
        Double input = 30.0;
        Double expected = 1/input;

        //When
        Double actual = sciCalculator.inverseSine(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseCos() {
        //Given 5
        //expected 1/sin
        Double expected = 1 / Math.cos(input);

        //When
        Double actual = sciCalculator.inverseCosine(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseTan() {
        //Given 5
        //expected 1/sin
        Double expected = 1 / Math.tan(input);

        //When
        Double actual = sciCalculator.inverseTangent(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void log() {
        //Given 10
        //expected 1
        Double expected = Math.log(input);

        //When
        Double actual = sciCalculator.log(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorial() {
        //Given 5
        //expected 120
        double input = 5.0;

        Double expected = input * (input-1) * (input-2) * (input-3) * (input-4);

        //When
        Double actual = sciCalculator.factorial(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radToDegrees() {
        //Given
        double radians = input;
        input = 1.0;
        double PI = 3.14;
        Double expected = input * 180/PI;

        //When
        Double actual = sciCalculator.radToDegrees();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degToRadians() {
        //Given
        double radians = input;
        input = 1.0;
        double PI = 3.14;
        Double expected = input * PI/180;

        //When
        Double actual = sciCalculator.radToDegrees();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseLog() {
        //Given

    }

}



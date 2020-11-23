package com.codedifferently.tdd.calculator.calculator.scientific;


import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {
    SciCalculator sciCalculator = new SciCalculator();
    Double input = 0.0;

    @Test
    public void sineTest() {
        //Given
        SciCalculator sciCalculator = new SciCalculator();
        Double input = 30.0;
        Double expected = -0.9880316241;
        //When
        Double actual = sciCalculator.sine(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void cosineTest() {
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.memory.setCurrentValue(input);
        input = 30.0;
        //Given
        Double expected = 0.1542514499;
        //When
        Double actual = sciCalculator.cosine(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }


    @Test
    public void testTangent() {
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.memory.setCurrentValue(input);
        input = 30.0;
        //Given
        //expected = 0.8660254038
        Double expected = -6.4053311966;
        //When
        Double actual = sciCalculator.tangent(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

     @Test
    public void inverseTest() {
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
        //expected arcsin(1)
        Double input = 1.0;
        Double expected = 1.5707963268;
        //When
        Double actual = sciCalculator.inverseSine(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverseCos() {
        //Given
        //expected
        Double input = 1.0;
        Double expected = 0.0;
        //When
        Double actual = sciCalculator.inverseCosine(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseTan() {
        //Given 5
        //expected 1/sin
        Double input = 90.0;
        Double expected = 1.5596856729;
        //When
        Double actual = sciCalculator.inverseTangent(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void log() {
        //Given 10
        //expected 1
        Double input = 10.0;
        Double expected = 1.0;
        //When
        Double actual = sciCalculator.log(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorial() {
        //Given 5
        //expected 120
        Double input = 5.0;
        Double expected = input * (input-1) * (input-2) * (input-3) * (input-4);
        //When
        Double actual = sciCalculator.factorial(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radToDegreesTest() {
        //Given
        input = 1.0;
        Double expected = 57.295;
        //When
        Double actual = sciCalculator.radToDegrees(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void degToRadiansTest() {
        //Given
        input = 90.0;
        Double PI = 3.14;
        Double expected = (PI)/2;
        //When
        Double actual = sciCalculator.degToRad(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseLogTest() {
        //Given
        Double input = 10.0;
        Double expected = 100.0;
        //When
        Double actual = sciCalculator.inverseLog(input);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void naturalLogTest() {
        //Given 10
        //expected log(10) or can also be written as ln(10)
        Double input = 10.0;
        Double expected = 2.302585093;
        //When
        Double actual = sciCalculator.naturalLog(input);
        //Then
        Assert.assertEquals(expected, actual, 0.001);

    }
    @Test
    public void inverseNaturalLog() {

    //Given 10
    //expected euler^2
    Double input = 2.0;
    Double expected = 7.3890560989;
    //When
    Double actual = sciCalculator.inverseNaturalLog(input);
    //Then
        Assert.assertEquals(expected, actual, 0.001);

    }

    @Test
    public void switchSign() {
        //Given
        Double input = 5.0;
        Double expected = -5.0;
        //When
        Double actual = sciCalculator.switchSign(input);
        //Then
        Assert.assertEquals(expected,actual);
    }

}



package com.codedifferently.tdd.calculator.calculator.scientific;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest extends TestCase {
    SciCalculator sciCalculator = new SciCalculator();
    Double input = 30.0;

    @Test
    public void testSineDeg() {
        SciCalculator sciCalculator = new SciCalculator();
        Double input = 30.0;
        //Given
        //expected =
        Double expected = -0.9890316241;

        //When
        Double actual = sciCalculator.sine();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCosine() {
        SciCalculator sciCalculator = new SciCalculator();
        Double input = 30.0;
        //Given
        //expected = 0.8660254038
        Double expected = 0.1542514499;

        //When
        Double actual = sciCalculator.cosine(input);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTangent() {

        //Given
        //expected = 0.8660254038
        Double expected = Math.tan(input);

        //When
        Double actual = sciCalculator.tangent(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRadianDegrees() {
        //Given angles in degree 30
        //expected 0.5
        Double expected = Math.toRadians(input);

        //When
        //Double actual = sciCalc.toRadians();

        //Then
        //Assert.assertEquals(expected, actual);
    }

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
    public void testInverseSin() {
        //Given 5
        //expected 1/sin
        Double expected = 1 / Math.sin(input);

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
        Double actual = sciCalculator.inverseCosine();

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
    public void logarithm() {
        //Given 10
        //expected 1
        Double expected = Math.log(input);

        //When
        Double actual = sciCalculator.log(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

}



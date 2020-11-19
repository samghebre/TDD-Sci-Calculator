package com.codedifferently.tdd.calculator.calculator.scientific;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest extends TestCase {
    SciCalculator sciCalc = new SciCalculator();
    Double input = 30.0;

    @Test
    public void testTrigonometry1() {

        //Given
        //expected = 0.5
        Double expected = Math.sin(input);

        //When
        Double actual = sciCalc.sine();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTrigonometry2() {

        //Given
        //expected = 0.8660254038
        Double expected = Math.cos(input);

        //When
        Double actual = sciCalc.cosine();

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTrigonometry3() {

        //Given
        //expected = 0.8660254038
        Double expected = Math.tan(input);

        //When
        Double actual = sciCalc.tangent();

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
        Double actual = sciCalc.inverse(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseSin() {
        //Given 5
        //expected 1/sin
        Double expected = 1 / Math.sin(input);

        //When
        Double actual = sciCalc.inverseSine();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseCos() {
        //Given 5
        //expected 1/sin
        Double expected = 1 / Math.cos(input);

        //When
        Double actual = sciCalc.inverseCosine();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseTan() {
        //Given 5
        //expected 1/sin
        Double expected = 1 / Math.tan(input);

        //When
        Double actual = sciCalc.inverseTangent(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void logarithm() {
        //Given 10
        //expected 1
        Double expected = Math.log(input);

        //When
        Double actual = sciCalc.log(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

}



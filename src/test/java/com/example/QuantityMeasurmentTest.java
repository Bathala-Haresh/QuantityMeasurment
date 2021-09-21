package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QuantityMeasurmentTest {

    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0FeetwithDifferentReference_shouldReturnNotSame() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Feetand0FeetwithDifferentType_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNull_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0InchwithDifferentReference_shouldReturnNotSame() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given0Inchand0InchwithDifferentType_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1Feetand12Inch_shouldReturnEqual() {
        Feet feet1 = new Feet(1);
        double actualValue = feet1.getFeetToInch();
        double expectedValue = 12;
        Assertions.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void given1Feetand24Inch_shouldReturnFalse() {
        Feet feet1 = new Feet(1.0);
        double actualValue = feet1.getFeetToInch();
        double expectedValue = 24;
        Assertions.assertNotEquals(actualValue, expectedValue);
    }

    @Test
    public void given1Yardand3FeetWhenCompared_shouldReturnEqual() {
        Yard yard1 = new Yard(1.0);
        double actualValue = yard1.yardToFeet();
        double expectedValue = 3;
        Assertions.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void given3Feetand1YardWhenCompared_shouldReturnEqual() {
        Feet feet = new Feet(3.0);
        double expectedValue = feet.getFeetToYard();
        double actualValue = 1;
        Assertions.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void given1Feetand1YardWhenCompared_shouldReturnNotEqual() {
        Feet feet = new Feet(1.0);
        double expectedValue = feet.getFeetToYard();
        double actualValue = 1;
        Assertions.assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void given1Inchand1YardWhenCompared_shouldReturnNotEqual() {
        Inch inch = new Inch(1.0);
        double expectedValue = inch.getInchToYard();
        double actualValue = 1;
        Assertions.assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void given1Yardand36InchWhenCompared_shouldReturnEqual() {
        Yard yard = new Yard(1.0);
        double expectedValue = yard.yardToInch();
        double actualValue = 36;
        Assertions.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void given36Inchand1YardWhenCompared_shouldReturnEqual() {
        Inch inch = new Inch(36);
        double expectedValue = inch.getInchToYard();
        double actualValue = 1;
        Assertions.assertEquals(actualValue, expectedValue);
    }
}

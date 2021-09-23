package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QuantityMeasurmentTest {

    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        QuantityMeasurment feet1 = new QuantityMeasurment(Length.FEET, 0.0);
        QuantityMeasurment feet2 = new QuantityMeasurment(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_shouldReturnNotEqual() {
        QuantityMeasurment feet1 = new QuantityMeasurment(Length.FEET, 0.0);
        QuantityMeasurment feet2 = new QuantityMeasurment(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_shouldReturnNotEqual() {
        QuantityMeasurment feet1 = new QuantityMeasurment(Length.FEET, 0.0);
        QuantityMeasurment feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0FeetwithDifferentReference_shouldReturnNotSame() {
        QuantityMeasurment feet1 = new QuantityMeasurment(Length.FEET, 0.0);
        QuantityMeasurment feet2 = new QuantityMeasurment(Length.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Feetand0FeetwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurment feet1 = new QuantityMeasurment(Length.FEET, 0.0);
        QuantityMeasurment feet2 = new QuantityMeasurment(Length.FEET, 0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 0.0);
        QuantityMeasurment inch2 = new QuantityMeasurment(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnNotEqual() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 0.0);
        QuantityMeasurment inch2 = new QuantityMeasurment(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNull_shouldReturnNotEqual() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 0.0);
        QuantityMeasurment inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0InchwithDifferentReference_shouldReturnNotSame() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 0.0);
        QuantityMeasurment inch2 = new QuantityMeasurment(Length.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given0Inchand0InchwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 0.0);
        QuantityMeasurment inch2 = new QuantityMeasurment(Length.INCH, 0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1Feetand1InchWhenCompared_shouldReturnNotEqual() {
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 1.0);
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 1.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    public void given1Feetand12Inch_shouldReturnTrue() {
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 1);
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 12);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_shouldReturnTrue() {
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 12);
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 1);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given1Yardand3FeetWhenCompared_shouldReturnTrue() {
        QuantityMeasurment yard = new QuantityMeasurment(Length.YARD, 1);
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 3);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3Feetand1YardWhenCompared_shouldReturnTrue() {
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 3);
        QuantityMeasurment yard = new QuantityMeasurment(Length.YARD, 1);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1YardWhenCompared_shouldReturnFalse() {
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 1);
        QuantityMeasurment yard = new QuantityMeasurment(Length.YARD, 1);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1YardWhenCompared_shouldReturnFalse() {
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 1);
        QuantityMeasurment yard = new QuantityMeasurment(Length.YARD, 1);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36InchWhenCompared_shouldReturnTrue() {
        QuantityMeasurment yard = new QuantityMeasurment(Length.YARD, 1);
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 36);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1YardWhenCompared_shouldReturnTrue() {
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 36);
        QuantityMeasurment yard = new QuantityMeasurment(Length.YARD, 1);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1InchWhenCompared_shouldReturnTrue() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 1);
        QuantityMeasurment inch2 = new QuantityMeasurment(Length.INCH, 1);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2Inchand2InchWhenAdded_shouldReturn4inches() {
        QuantityMeasurment inch1 = new QuantityMeasurment(Length.INCH, 2);
        QuantityMeasurment inch2 = new QuantityMeasurment(Length.INCH, 2);
        QuantityMeasurment expectedSum = new QuantityMeasurment(Length.INCH, 4);
        QuantityMeasurment result = inch1.sumOfQuantity(inch2, Length.INCH);
        Assertions.assertEquals(expectedSum, result);
    }

    @Test
    public void given1Feetand2InchWhenAdded_shouldReturn14inches() {
        QuantityMeasurment feet = new QuantityMeasurment(Length.FEET, 1);
        QuantityMeasurment inch = new QuantityMeasurment(Length.INCH, 2);
        QuantityMeasurment expected = new QuantityMeasurment(Length.INCH, 14);
        QuantityMeasurment result = feet.sumOfQuantity(inch, Length.INCH);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void given1Feetand1FeetWhenAdded_shouldReturn24inches() {
        QuantityMeasurment feet1 = new QuantityMeasurment(Length.FEET, 1);
        QuantityMeasurment feet2 = new QuantityMeasurment(Length.FEET, 1);
        QuantityMeasurment expected = new QuantityMeasurment(Length.INCH, 24);
        QuantityMeasurment result = feet1.sumOfQuantity(feet2, Length.INCH);
        Assertions.assertEquals(expected, result);
    }


}

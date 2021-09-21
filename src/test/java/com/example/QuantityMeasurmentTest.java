package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QuantityMeasurmentTest {

    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0FeetwithDifferentReference_shouldReturnNotSame() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Feetand0FeetwithDifferentType_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNull_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0InchwithDifferentReference_shouldReturnNotSame() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given0Inchand0InchwithDifferentType_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1Feetand1InchWhenCompared_shouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    public void given1Feetand12Inch_shouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 1);
        Length inch = new Length(Length.Unit.INCH, 12);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_shouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 12);
        Length feet = new Length(Length.Unit.FEET, 1);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given1Yardand3FeetWhenCompared_shouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1);
        Length feet = new Length(Length.Unit.FEET, 3);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3Feetand1YardWhenCompared_shouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3);
        Length yard = new Length(Length.Unit.YARD, 1);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1YardWhenCompared_shouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1);
        Length yard = new Length(Length.Unit.YARD, 1);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1YardWhenCompared_shouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 1);
        Length yard = new Length(Length.Unit.YARD, 1);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36InchWhenCompared_shouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1);
        Length inch = new Length(Length.Unit.INCH, 36);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1YardWhenCompared_shouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 36);
        Length yard = new Length(Length.Unit.YARD, 1);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1InchWhenCompared_shouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 1);
        Length inch2 = new Length(Length.Unit.INCH, 1);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2Inchand5CMWhenCompared_shouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.Centi_Meter, 5.08);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2Inchand2InchWhenAdded_shouldReturn4inches() {
        Length inch1 = new Length(Length.Unit.INCH, 2);
        Length inch2 = new Length(Length.Unit.INCH, 2);
        Length expectedSum = new Length(Length.Unit.INCH, 4);
        Length result = inch1.add(inch2);
        Assertions.assertEquals(expectedSum, result);
    }

    @Test
    public void given1Feetand2InchWhenAdded_shouldReturn14inches() {
        Length feet = new Length(Length.Unit.FEET, 1);
        Length inch = new Length(Length.Unit.INCH, 2);
        Length expected = new Length(Length.Unit.INCH, 14);
        Length result = feet.add(inch);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void given1Feetand1FeetWhenAdded_shouldReturn24inches() {
        Length feet1 = new Length(Length.Unit.FEET, 1);
        Length feet2 = new Length(Length.Unit.FEET, 1);
        Length expected = new Length(Length.Unit.INCH, 24);
        Length result = feet1.add(feet2);
        Assertions.assertEquals(expected, result);
    }


}

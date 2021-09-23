package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WeightMeasurmentTest {

    @Test
    public void given1Kgand1000GramsWhenCompared_shouldReturnTrue(){
        QuantityMeasurment kg = new QuantityMeasurment(Weights.KILOGRAM,1);
        QuantityMeasurment grams = new QuantityMeasurment(Weights.GRAM,1000);
        boolean compareCheck = kg.compare(grams);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Tonneand1000KgWhenCompared_shouldReturnTrue(){
        QuantityMeasurment tonne = new QuantityMeasurment(Weights.TONNE,1);
        QuantityMeasurment kg = new QuantityMeasurment(Weights.KILOGRAM,1000);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Tonneand1000GramsWhenAdded_shouldReturn1001Kg(){
        QuantityMeasurment tonne = new QuantityMeasurment(Weights.TONNE,1);
        QuantityMeasurment grams = new QuantityMeasurment(Weights.GRAM,1000);
        QuantityMeasurment expected = new QuantityMeasurment(Weights.KILOGRAM,1001);
        QuantityMeasurment result = tonne.sumOfQuantity(grams,Weights.KILOGRAM);
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() {
        QuantityMeasurment gram1 = new QuantityMeasurment(Weights.GRAM, 0.0);
        QuantityMeasurment gram2 = new QuantityMeasurment(Weights.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqual() {
        QuantityMeasurment gram1 = new QuantityMeasurment(Weights.GRAM, 0.0);
        QuantityMeasurment gram2 = new QuantityMeasurment(Weights.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNull_ShouldReturnNotEqual() {
        QuantityMeasurment gram1 = new QuantityMeasurment(Weights.GRAM, 0.0);
        QuantityMeasurment gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqual() {
        QuantityMeasurment gram1 = new QuantityMeasurment(Weights.GRAM, 0.0);
        QuantityMeasurment gram2 = new QuantityMeasurment(Weights.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }
    @Test
    public void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        QuantityMeasurment weight = new QuantityMeasurment(Weights.GRAM, 0.0);
        QuantityMeasurment volume = new QuantityMeasurment(Volume.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }
    @Test
    public void given0KgAnd0Kg_ShouldReturnEqual() {
        QuantityMeasurment kg1 = new QuantityMeasurment(Weights.KILOGRAM, 0.0);
        QuantityMeasurment kg2 = new QuantityMeasurment(Weights.KILOGRAM, 0.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    public void given0KGAnd1KG_ShouldReturnNotEqual() {
        QuantityMeasurment kg1 = new QuantityMeasurment(Weights.KILOGRAM, 0.0);
        QuantityMeasurment kg2 = new QuantityMeasurment(Weights.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given0KGAndNull_ShouldReturnNotEqual() {
        QuantityMeasurment kg1 = new QuantityMeasurment(Weights.KILOGRAM, 0.0);
        QuantityMeasurment kg2 = null;
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given0KGAnd0KGFromDiffRef_ShouldReturnNotEqual() {
        QuantityMeasurment kg1 = new QuantityMeasurment(Weights.KILOGRAM, 0.0);
        QuantityMeasurment kg2 = new QuantityMeasurment(Weights.KILOGRAM, 0.0);
        Assertions.assertNotSame(kg1, kg2);
    }
}

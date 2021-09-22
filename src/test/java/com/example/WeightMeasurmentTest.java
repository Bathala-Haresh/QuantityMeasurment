package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WeightMeasurmentTest {

    @Test
    public void given1Kgand1000GramsWhenCompared_shouldReturnTrue(){
        Weights kg = new Weights(Weights.Unit.KG,1);
        Weights grams = new Weights(Weights.Unit.GRAMS,1000);
        boolean compareCheck = kg.compare(grams);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Tonneand1000KgWhenCompared_shouldReturnTrue(){
        Weights tonne = new Weights(Weights.Unit.TONNE,1);
        Weights kg = new Weights(Weights.Unit.KG,1000);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Tonneand1000GramsWhenAdded_shouldReturn1001Kg(){
        Weights tonne = new Weights(Weights.Unit.TONNE,1);
        Weights grams = new Weights(Weights.Unit.GRAMS,1000);
        Weights expected = new Weights(Weights.Unit.KG,1001);
        Weights result = tonne.add(grams);
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() {
        Weights gram1 = new Weights(Weights.Unit.GRAMS, 0.0);
        Weights gram2 = new Weights(Weights.Unit.GRAMS, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqual() {
        Weights gram1 = new Weights(Weights.Unit.GRAMS, 0.0);
        Weights gram2 = new Weights(Weights.Unit.GRAMS, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNull_ShouldReturnNotEqual() {
        Weights gram1 = new Weights(Weights.Unit.GRAMS, 0.0);
        Weights gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqual() {
        Weights gram1 = new Weights(Weights.Unit.GRAMS, 0.0);
        Weights gram2 = new Weights(Weights.Unit.GRAMS, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }
    @Test
    public void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        Weights weight = new Weights(Weights.Unit.GRAMS, 0.0);
        Volume volume = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }
    @Test
    public void given0KgAnd0Kg_ShouldReturnEqual() {
        Weights kg1 = new Weights(Weights.Unit.KG, 0.0);
        Weights kg2 = new Weights(Weights.Unit.KG, 0.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    public void given0KGAnd1KG_ShouldReturnNotEqual() {
        Weights kg1 = new Weights(Weights.Unit.KG, 0.0);
        Weights kg2 = new Weights(Weights.Unit.KG, 1.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given0KGAndNull_ShouldReturnNotEqual() {
        Weights kg1 = new Weights(Weights.Unit.KG, 0.0);
        Weights kg2 = null;
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given0KGAnd0KGFromDiffRef_ShouldReturnNotEqual() {
        Weights kg1 = new Weights(Weights.Unit.KG, 0.0);
        Weights kg2 = new Weights(Weights.Unit.KG, 0.0);
        Assertions.assertNotSame(kg1, kg2);
    }
}

package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VolumeMeasurmentTest {

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        QuantityMeasurment gallon1 = new QuantityMeasurment(Volume.GALLON, 0.0);
        QuantityMeasurment gallon2 = new QuantityMeasurment(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        QuantityMeasurment gallon1 = new QuantityMeasurment(Volume.GALLON, 1.0);
        QuantityMeasurment gallon2 = new QuantityMeasurment(Volume.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        QuantityMeasurment gallon1 = new QuantityMeasurment(Volume.GALLON, 1.0);
        QuantityMeasurment gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        QuantityMeasurment gallon1 = new QuantityMeasurment(Volume.GALLON, 1.0);
        QuantityMeasurment gallon2 = new QuantityMeasurment(Volume.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }


    @Test
    public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        QuantityMeasurment liter1 = new QuantityMeasurment(Volume.LITER, 0.0);
        QuantityMeasurment liter2 = new QuantityMeasurment(Volume.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    public void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        QuantityMeasurment liter1 = new QuantityMeasurment(Volume.LITER, 1.0);
        QuantityMeasurment liter2 = new QuantityMeasurment(Volume.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    public void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurment gallon = new QuantityMeasurment(Volume.GALLON, 0.0);
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurment gallon = new QuantityMeasurment(Volume.GALLON, 1.0);
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 1.0);
        QuantityMeasurment ml = new QuantityMeasurment(Volume.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        QuantityMeasurment gallon = new QuantityMeasurment(Volume.GALLON, 1.0);
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 3.78);
        QuantityMeasurment gallon = new QuantityMeasurment(Volume.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurment ml = new QuantityMeasurment(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Gallonand3$78LitersWhenAdded_shouldReturn7$56Liters(){
        QuantityMeasurment gallon = new QuantityMeasurment(Volume.GALLON,1);
        QuantityMeasurment liters = new QuantityMeasurment(Volume.LITER,3.78);
        QuantityMeasurment expected = new QuantityMeasurment(Volume.LITER,7.56);
        QuantityMeasurment actual = gallon.sumOfQuantity(liters,Volume.LITER);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        QuantityMeasurment liter = new QuantityMeasurment(Volume.LITER, 1.0);
        QuantityMeasurment ml = new QuantityMeasurment(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurment expectedSum = new QuantityMeasurment(Volume.LITER, 2.0);
        QuantityMeasurment actual = liter.sumOfQuantity(ml,Volume.LITER);
        Assertions.assertEquals(expectedSum, actual);
    }

}

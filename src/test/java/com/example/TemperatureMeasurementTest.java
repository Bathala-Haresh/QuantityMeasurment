package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TemperatureMeasurementTest {
    @Test
    public void given212Foreignheitand100Celcius_shouldReturnEqual() {
        QuantityMeasurment forignheit = new QuantityMeasurment(Temperature.DEG_F, 212);
        QuantityMeasurment celcius = new QuantityMeasurment(Temperature.DEG_C, 100);
        boolean compareCheck = forignheit.compare(celcius);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given2Foreignheitand100Celcius_shouldReturnFalse() {
        QuantityMeasurment forignheit = new QuantityMeasurment(Temperature.DEG_F, 2);
        QuantityMeasurment celcius = new QuantityMeasurment(Temperature.DEG_C, 100);
        boolean compareCheck = forignheit.compare(celcius);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        QuantityMeasurment temp1 = new QuantityMeasurment(Temperature.DEG_F, 0.0);
        QuantityMeasurment temp2 = new QuantityMeasurment(Temperature.DEG_F, 0.0);
        Assertions.assertEquals(temp1, temp2);
    }

    @Test
    public void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualTemperature() {
        QuantityMeasurment temp1 = new QuantityMeasurment(Temperature.DEG_F, 0.0);
        QuantityMeasurment temp2 = new QuantityMeasurment(Temperature.DEG_F, 1.0);
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    public void given0FahrenheitAndNull_ShouldReturnNotEqualTemperature() {
        QuantityMeasurment temp1 = new QuantityMeasurment(Temperature.DEG_F, 0.0);
        QuantityMeasurment temp2 = null;
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    public void given0FahrenheitAnd0FahrenheitFromDiffRef_ShouldReturnNotEqualTemperature() {
        QuantityMeasurment temp1 = new QuantityMeasurment(Temperature.DEG_F, 0.0);
        QuantityMeasurment temp2 = new QuantityMeasurment(Temperature.DEG_F, 1.0);
        Assertions.assertNotSame(temp1, temp2);
    }

    @Test
    public void given77FahrenheitAnd25Celsius_WhenCompared_ShouldReturnEqualTemp() {
        QuantityMeasurment fahrenheit = new QuantityMeasurment(Temperature.DEG_F, 77.0);
        QuantityMeasurment celsius = new QuantityMeasurment(Temperature.DEG_C, 25.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}

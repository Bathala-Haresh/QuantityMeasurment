package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TemperatureMeasurementTest {
    @Test
    public void given212Foreignheitand100Celcius_shouldReturnEqual() {
        Temperature forignheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212);
        Temperature celcius = new Temperature(Temperature.Unit.CELSIUS, 100);
        boolean compareCheck = forignheit.compare(celcius);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given2Foreignheitand100Celcius_shouldReturnFalse() {
        Temperature forignheit = new Temperature(Temperature.Unit.FAHRENHEIT, 2);
        Temperature celcius = new Temperature(Temperature.Unit.CELSIUS, 100);
        boolean compareCheck = forignheit.compare(celcius);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temp1, temp2);
    }

    @Test
    public void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    public void given0FahrenheitAndNull_ShouldReturnNotEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = null;
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    public void given0FahrenheitAnd0FahrenheitFromDiffRef_ShouldReturnNotEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotSame(temp1, temp2);
    }

    @Test
    public void given77FahrenheitAnd25Celsius_WhenCompared_ShouldReturnEqualTemp() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 77.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 25.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}



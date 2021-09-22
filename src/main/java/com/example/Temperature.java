package com.example;

public class Temperature {
    public enum Unit {CELSIUS, FAHRENHEIT}

    private final Unit unit;
    private final double temp;

    public Temperature(Unit unit, double temp) {
        this.unit = unit;
        this.temp = temp;
    }

    public boolean compare(Temperature that) {
        if (this.unit.equals(Unit.FAHRENHEIT) && that.unit.equals(Unit.CELSIUS))
            return Double.compare((this.temp - 32) * 5 / 9, that.temp) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.temp, temp) == 0 && unit == that.unit;
    }
}
package com.example;

import java.util.Objects;

public class QuantityMeasurment {

    public Units unit;
    public double value;

    public QuantityMeasurment(Units unit, double value){
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(QuantityMeasurment that){
        if(this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this),that.unit.convertToBaseUnit(that)) == 0;
    }
    public QuantityMeasurment sumOfQuantity(QuantityMeasurment that, Units requiredUnit) {
        double sum = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new QuantityMeasurment(requiredUnit, sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurment that = (QuantityMeasurment) o;
        return Double.compare(that.value, value) == 0 && Objects.equals(unit, that.unit);
    }
}

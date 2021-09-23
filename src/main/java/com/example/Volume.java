package com.example;

import java.util.Objects;

public enum Volume implements Units{
    MILLI_LITER(0.001),LITER(1),GALLON(3.78);

    private final double baseUnitConvertor;

    Volume(double baseUnitConvertor){
        this.baseUnitConvertor = baseUnitConvertor;
    }


    @Override
    public double convertToBaseUnit(QuantityMeasurment obj) {
        return obj.value * baseUnitConvertor;
    }
}

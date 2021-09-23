package com.example;

public enum Length implements Units{
    INCH(1), FEET(12), YARD(36), CENTI_METER(1 / 2.54);

    private final double baseUnitConvertor;

    Length(double baseUnitConvertor){
        this.baseUnitConvertor = baseUnitConvertor;
    }


    @Override
    public double convertToBaseUnit(QuantityMeasurment obj) {
        return obj.value * baseUnitConvertor;
    }
}


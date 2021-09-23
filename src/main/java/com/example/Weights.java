package com.example;


public enum Weights implements Units {
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    private final double baseUnitCovertor;

    Weights(double baseUnitConvertor) {
        this.baseUnitCovertor = baseUnitConvertor;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurment obj) {
        return obj.value * baseUnitCovertor;
    }
}

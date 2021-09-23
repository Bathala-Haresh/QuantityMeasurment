package com.example;

import java.util.function.Function;

public enum Temperature implements Units{

    DEG_F(true), DEG_C(false);

    private final Function<Double, Double> baseUnitConversion;
    private final Function<Double, Double> degFToDegC = (Double degF) -> (degF - 32) * 5 / 9;
    private final Function<Double, Double> degCToDegF =(Double degC) -> degC;

    Temperature(boolean isFarenhit) {
        if (isFarenhit) this.baseUnitConversion = degFToDegC;
        else this.baseUnitConversion = degCToDegF;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurment obj) {
        return baseUnitConversion.apply(obj.value);
    }
}
package com.example;

import java.util.Objects;

public class Weights {

    private final double value;
    private final Unit unit;
    private static final double Kg_To_Grams = 1000.0;
    private static final double Tonne_To_Grams = 1000.0;

    enum Unit {
        KG, GRAMS, TONNE
    }

    public Weights(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weights that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.KG) && that.unit.equals(Unit.GRAMS))
            return Double.compare(this.value * Kg_To_Grams, that.value) == 0;
        if (this.unit.equals(Unit.GRAMS) && that.unit.equals(Unit.KG))
            return Double.compare(this.value, that.value / Kg_To_Grams) == 0;
        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.KG))
            return Double.compare(this.value * Tonne_To_Grams, that.value) == 0;
        if (this.unit.equals(Unit.KG) && that.unit.equals(Unit.TONNE))
            return Double.compare(this.value, that.value / Tonne_To_Grams) == 0;
        return false;
    }

    public Weights add(Weights that) {
        double sum = 0.0;
        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.GRAMS))
            sum = this.value * Tonne_To_Grams + that.value / Kg_To_Grams;
        return new Weights(Unit.KG, sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weights weights = (Weights) o;
        return Double.compare(weights.value, value) == 0 && unit == weights.unit;
    }

}

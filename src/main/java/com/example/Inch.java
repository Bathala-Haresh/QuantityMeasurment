package com.example;

import java.util.Objects;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    public double getInchToFeet() {
        return value / 12;
    }
    public double getInchToYard(){
        return value / 36;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }
}

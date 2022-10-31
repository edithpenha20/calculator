package com.calculator.area;

import com.calculator.Value;

import java.math.BigDecimal;

public class Retangle implements TypeArea {

    private Value base;
    private Value height;

    public Retangle(Value base, Value height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public BigDecimal calculate() {
        return base.getValue().multiply(height.getValue());
    }

    @Override
    public String toString() {
        return calculate().toString();
    }


    //    @Override
//    public BigDecimal calculate(Value first, Value second) {
//        return first.getValue().multiply(second.getValue());
//    }

//    @Override
//    public String getSymbol() {
//        return "sqt";
//    }
}

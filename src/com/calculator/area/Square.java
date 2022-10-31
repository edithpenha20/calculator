package com.calculator.area;

import com.calculator.Value;

import java.math.BigDecimal;

public class Square implements TypeArea{

    private Value value;

    public Square(Value value) {
        this.value = value;
    }

    @Override
    public BigDecimal calculate() {
        return value.getValue().multiply(value.getValue());
    }

    @Override
    public String toString() {
        return calculate().toString();
    }

//    @Override
//    public BigDecimal calculate(Value value) {
//
//        return value.getValue().multiply(value.getValue());
//    }
}

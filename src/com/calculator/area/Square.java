package com.calculator.area;

import com.calculator.Value;

import java.math.BigDecimal;

public class Square implements TypeArea{

    @Override
    public BigDecimal calculate(Value value) {

        return value.getValue().multiply(value.getValue());
    }
}

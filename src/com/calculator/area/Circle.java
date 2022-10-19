package com.calculator.area;

import com.calculator.Value;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle implements TypeArea{

    @Override
    public BigDecimal calculate(Value value) {
        BigDecimal radius = value.getValue().multiply(value.getValue());
        return radius.multiply(new BigDecimal(3.14)).setScale(2, RoundingMode.HALF_EVEN);
    }
}

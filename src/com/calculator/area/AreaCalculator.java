package com.calculator.area;

import com.calculator.Value;

import java.math.BigDecimal;

public class AreaCalculator {

    public BigDecimal calcular(Value value, TypeArea area){
        return area.calculate(value);
    }
}

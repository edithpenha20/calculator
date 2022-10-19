package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;

public class StandardCalculator {

    public BigDecimal calcular(Value first, Value second, Operation op){
        return op.calculate(first, second);
    }
}

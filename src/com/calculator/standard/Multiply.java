package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;

public class Multiply implements Operation{

    @Override
    public BigDecimal calculate(Value first, Value second) {
        return first.getValue().multiply(second.getValue());
    }
}

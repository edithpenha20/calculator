package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;

public class Subtract implements Operation{

    @Override
    public BigDecimal calculate(Value first, Value second) {
        return first.getValue().subtract(second.getValue());
    }

}

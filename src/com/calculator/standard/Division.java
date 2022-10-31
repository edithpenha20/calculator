package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division implements Operation{

    @Override
    public BigDecimal calculate(Value first, Value second) {
        return first.getValue().divide(second.getValue(),3, RoundingMode.UP);
    }

}

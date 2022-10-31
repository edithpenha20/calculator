package com.calculator.standard;


import com.calculator.Value;

import java.math.BigDecimal;

public class Sum implements Operation {

    @Override
    public BigDecimal calculate(Value first, Value second) {
        return first.getValue().add(second.getValue());
    }


}

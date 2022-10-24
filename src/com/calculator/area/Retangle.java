package com.calculator.area;

import com.calculator.Value;
import com.calculator.standard.Operation;

import java.math.BigDecimal;

public class Retangle implements Operation {

    @Override
    public BigDecimal calculate(Value first, Value second) {
        return first.getValue().multiply(second.getValue());
    }

//    @Override
//    public String getSymbol() {
//        return "sqt";
//    }
}

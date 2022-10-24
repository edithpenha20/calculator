package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;

public class Potency implements Operation{
    @Override
    public BigDecimal calculate(Value first, Value second) {
        //return first.getValue().pow(second.getValue()); - segundo valor precisa ser int
        return null;
    }

//    @Override
//    public String getSymbol() {
//        return "^";
//    }
}

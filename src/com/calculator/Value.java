package com.calculator;

import java.math.BigDecimal;

public class Value {

    private BigDecimal value = BigDecimal.ZERO;

//    public Value(CharSequence input) {
//        value = new BigDecimal(input.toString());
//    }

    public Value(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}

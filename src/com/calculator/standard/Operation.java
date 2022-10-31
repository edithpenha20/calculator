package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;

public interface Operation {

    BigDecimal calculate(Value first, Value second);

}

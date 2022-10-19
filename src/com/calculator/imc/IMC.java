package com.calculator.imc;

import com.calculator.Value;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IMC {

    public BigDecimal calcular(Value weight, Value height){
        BigDecimal pow = height.getValue().pow(2);
        return weight.getValue().divide(pow,2, RoundingMode.UP);
    }

}

package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;

public class TestaCalcPadrao {

    public static void main(String[] args) {
        Value first = new Value(new BigDecimal(1.00));
        Value second = new Value(new BigDecimal(1.3));
        StandardCalculator calc = new StandardCalculator();
        System.out.println(calc.calcular(first, second, new Division()));
    }
}

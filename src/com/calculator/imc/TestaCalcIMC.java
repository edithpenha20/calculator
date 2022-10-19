package com.calculator.imc;

import com.calculator.Value;

import java.math.BigDecimal;

public class TestaCalcIMC {

    public static void main(String[] args) {
        Value weight = new Value(new BigDecimal("71"));
        Value height = new Value(new BigDecimal("1.55"));
        IMC calc = new IMC();
        System.out.println(calc.calcular(weight, height));

    }
}

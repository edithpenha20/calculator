package com.calculator.area;

import com.calculator.Value;
import com.calculator.standard.StandardCalculator;

import java.math.BigDecimal;

public class TestaCalculadoraDeArea {

    public static void main(String[] args) {
        Value base = new Value(new BigDecimal(10));
        Value height = new Value(new BigDecimal(5));
        StandardCalculator calc = new StandardCalculator();
        System.out.println(calc.calcular(base, height, new Retangle()));
    }
}

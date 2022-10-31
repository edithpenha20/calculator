package com.calculator.imc;

import com.calculator.Value;

import java.math.BigDecimal;
import java.util.Scanner;

public class IMCController {

    Scanner input = new Scanner(System.in);

    public void handle() {
        try {

            System.out.println("Digite o peso a ser calculado: ");
            Value weight = new Value(new BigDecimal(input.next()));
            System.out.println("Digite a altura a ser calculada: ");
            Value height = new Value(new BigDecimal(input.next()));
            IMC calc = new IMC();
            System.out.println(calc.calcular(weight, height));

        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }
}

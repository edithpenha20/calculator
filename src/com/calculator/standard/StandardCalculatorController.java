package com.calculator.standard;

import com.calculator.Value;

import java.math.BigDecimal;
import java.util.Scanner;

public class StandardCalculatorController {

    private Operation operation;
    StandardCalculator calc = new StandardCalculator();

    Scanner input = new Scanner(System.in);

//    public void setModel(StandardCalculatorModel model) {
//        this.model = model;
//    }

//    public void handle(String command) {
//        try {
//            if (command.matches("\\+|-|\\*|/")) {
//                if (model.registerIsEmpty()) {
//                    model.enterA();
//                } else if (!model.inputIsEmpty()) {
//                    model.enterB();
//                }
//                model.addOperation(command);
//            } else if (command.matches("=")) {
//                model.enterB();
//            } else if (command.matches("C")) {
//                model.clear();
////            } else {
////                model.add(command);
//            }
//        } catch (RuntimeException exception) {
//            exception.printStackTrace();
//            model.fireErrorChange("Error");
//        }
//    }

    public void handle() {
        try {
            System.out.println("+ para soma");
            System.out.println("- para subtrair");
            System.out.println("* para multiplicar");
            System.out.println("/ para dividir");
            System.out.println("x para potência");
            System.out.println("Escolha qual operação deseja realizar: ");
            String op = input.next();

            System.out.println("Digite o primeiro valor: ");
            Value n1 = new Value(new BigDecimal(input.next()));
            System.out.println("Digite o segundo valor: ");
            Value n2 = new Value(new BigDecimal(input.next()));
            //this.model.realizaAcao(n1, n2, op);
            System.out.println(calc.calcular(n1, n2, addOperation(op)));


        } catch (RuntimeException exception) {
            exception.printStackTrace();
            //this.model.fireErrorChange("Error");
        }
    }

    public Operation addOperation(String name) {
        if ("+".equals(name)) {
            return operation = new Sum();
        } else if ("-".equals(name)) {
            return operation = new Subtract();
        } else if ("*".equals(name)) {
            return operation = new Multiply();
        } else if ("/".equals(name)) {
            return operation = new Division();
        }
        return operation;
    }
}

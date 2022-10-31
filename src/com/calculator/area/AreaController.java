package com.calculator.area;

import com.calculator.Value;

import java.math.BigDecimal;
import java.util.Scanner;

public class AreaController {

    private TypeArea typeArea;

    Scanner input = new Scanner(System.in);

    public void handle() {
        try {
            System.out.println("1 para área do Círculo");
            System.out.println("2 para área do Quadrado");
            System.out.println("3 para área do Retângulo");
            System.out.println("Escolha qual área deseja calcular: ");
            String op = input.next();

            if ("3".equals(op)) {
                System.out.println("Digite o valor da base: ");
                Value base = new Value(new BigDecimal(input.next()));
                System.out.println("Digite o valor da altura: ");
                Value height = new Value(new BigDecimal(input.next()));
                System.out.println(addTypeArea(op, base, height));
            }

            System.out.println("Digite o valor do raio: ");
            Value radius = new Value(new BigDecimal(input.next()));
            //System.out.println(addTypeArea(op, radius, ));


        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public TypeArea addTypeArea(String name, Value a, Value b) {
        if ("1".equals(name)) {
            return typeArea = new Circle(a);
        } else if ("2".equals(name)) {
            return typeArea = new Square(a);
        } else if ("3".equals(name)) {
            return typeArea = new Retangle(a, b);
        }
        return typeArea;
    }
}

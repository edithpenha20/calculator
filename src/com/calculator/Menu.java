package com.calculator;

import com.calculator.standard.StandardCalculatorController;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        StandardCalculatorController controller = new StandardCalculatorController();

        int value;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da calculadora que quer utilizar: ");
        value = input.nextInt();

        switch (value){
            case 1:
                controller.handle();
        }


    }
}

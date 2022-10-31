package com.calculator;

import com.calculator.area.AreaController;
import com.calculator.imc.IMCController;
import com.calculator.standard.StandardCalculatorController;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        StandardCalculatorController calculatorController = new StandardCalculatorController();
        IMCController imcController = new IMCController();
        AreaController areaController = new AreaController();

        int value;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da calculadora que quer utilizar: ");
        value = input.nextInt();

        switch (value){
            case 1:
                calculatorController.handle();
                break;
            case 2:
                imcController.handle();
                break;
            case 3:
                areaController.handle();
                break;
        }


    }
}

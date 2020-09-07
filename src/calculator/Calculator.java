/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;


/**
 *
 * @author pupil
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        double number2 = scanner.nextInt();
        System.out.println("Enter +, -, *, /");
        scanner.nextLine();
        String numberX = scanner.nextLine();
        double result = 0;
        if("+".equals(numberX)){
            result = number2 + number1;
        }
        if("-".equals(numberX)){
                result = number1 - number2;
    }
        if("*".equals(numberX)){
                result = number1 * number2;
        }
        if("/".equals(numberX)){
                result = number1 / number2;
        }
        
                   
        System.out.printf("Result"," ", number1," ", numberX," ", number2);
        System.out.printf("%.2f%n",result);
        System.out.println("bye");
    }
}
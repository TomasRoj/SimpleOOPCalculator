package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your first number please: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your second number please: ");;
        int number2 = Integer.parseInt(sc.nextLine());
        Calculator myCalculator = new Calculator();
        System.out.println("Enter action (plus, minus, multiply or divide)");
        String action = sc.nextLine();

        if (action.equals("plus")){
            System.out.println(myCalculator.add(number1, number2));
        }
        else if (action.equals("minus")){
            System.out.println(myCalculator.minus(number1, number2));
        }
        else if (action.equals("multiply")){
            System.out.println(myCalculator.multiply(number1, number2));
        }
        else if (action.equals("divide")){
            System.out.println(myCalculator.divide(number1, number2));
        }
        else{
            System.out.println("I am sorry but I cant do this action try it please later.");
        }
    }
}

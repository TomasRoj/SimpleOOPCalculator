package com.company;

public class Calculator{

    public Calculator(){

    }

    public int add(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a -b;
    }

    public int divide(int a, int b){
        if (b == 0){
            System.out.println("Error! Cant divide by zero!");
            return 0;
        }else{
            return a / b;
        }
    }

    public int multiply(int a, int b){
        if (b == 0) {
            System.out.println("Erro! Cant multiply with zero!");
            return 0;
        }else{
            return a * b;
        }
    }

}


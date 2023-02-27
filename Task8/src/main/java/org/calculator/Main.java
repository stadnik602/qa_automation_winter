package org.calculator;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.add(5, 8));
        System.out.println(calculation.subtract(5.0, 8.15));
        System.out.println(calculation.multiply(5.2, 8));
        System.out.println(calculation.divide(5, 8));
    }
}
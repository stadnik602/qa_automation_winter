package org.calculator;

public class Calculation {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return Math.ceil((a - b) * (Math.pow(10, 2))) / Math.pow(10, 2);
    }

    public double multiply(double a, double b) {
        double value = a * b;
        double scale = Math.pow(10, 2);
        return Math.ceil(value * scale) / scale;
    }

    public double divide(double a, double b) {
        double value = a / b;
        double scale = Math.pow(10, 2);
        return Math.ceil(value * scale) / scale;
    }

}

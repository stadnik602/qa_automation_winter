public class Main {
    public static void main(String[] args) {
//        Написать калькулятор:
//        Метод int getInt() - должен считывать с консоли целое число и возвращать его
//        Метод char getOperation() - должен считывать с консоли какое-то значение
//        и возвращать символ с операцией (+, -, * или /)
//        Метод int calc(int num1, int num2, char operation)
//        - должен выполнять над числами num1 и num2 арифметическую операцию,
//        заданную operation.
//        Метод main() - должен считывать 2 числа (с помощью getInt()),
//                считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

        System.out.println("Введите первое число");
        int value1 = Methods.getInt();
        System.out.println("Введите второе число");
        int value2 = Methods.getInt();
        char operator = Methods.getOperation();
        int result = Methods.calc(value1, value2, operator);
        System.out.println("Результат = " + result);
    }
}

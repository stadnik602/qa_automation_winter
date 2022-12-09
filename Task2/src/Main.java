import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задача 1.
//        Во многих странах для измерения небольших размеров используется не только
//        единица длины «сантиметр», но и такая единица,
//        как «дюйм» (1 дюйм = 2.54 сантиметра).
//        Выведите в консоль 10 см,равное размеру в дюймах,
//        и затем 25 дюймов,но в сантиметрах.
        System.out.println("Задача 1");
        final double inch = 2.54;
        System.out.println("10 сантиметров в дюймах равны  " + 10 / inch);
        System.out.println("25 дюймов в сантиметрах равны " + 25 * inch);
        System.out.println("------------------------------------------------------");

//        Задача 2.
//        Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу,
//        а родители добавили ему от себя еще некоторую сумму.
//        Выведите в консоль сколько денег есть у Васи на отпуск (в евро) если:
//        Вася заработал 5000 грн,Родители добавили-5000,
//        курс евро 1 евро = 28 грню
        System.out.println("Задача 2");
        final int euroInUAH = 28;
        int ownMoneyInUAH = 5000;
        int parentMoneyInUAH = 5000;
        int sumMoneyInEuro = (ownMoneyInUAH + parentMoneyInUAH) / euroInUAH;
        System.out.println("У Васи есть " + sumMoneyInEuro + " евро");
        System.out.println("------------------------------------------------------");

//        Задача 3.
//        Если x любое положительное двузначное число
//        Выведите на екран его десятки и еденицы (2 числа)
//        разделенные знаком «пробел», но в обратном порядке.
//        То есть для числа 45 будет выведено на экран 5 4.
        System.out.println("Задача 3");


        System.out.println("Введите положительное двухзначное число");
        int x = 0;
        while (x < 10 || x >= 100) {
            try {
                Scanner scanner1 = new Scanner(System.in);
                x = scanner1.nextInt();
                if (x < 10 || x >= 100) {
                    System.out.println("Вы ввели число меньше 10 либо больше или равно 100");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Вы ввели буквы. Введите двухзначное положительное число");
            }
        }
        System.out.println("Вы ввели число " + x);


        int unit = x % 10;
        int dec = x / 10;
        System.out.println(unit + " " + dec);
        System.out.println("------------------------------------------------------");

//        Задача 4.
//        Если x любое положительное двузначное число
//        Выведите на екран его в «полном виде»: например,
//        для числа 34 это будет выглядеть как 30+4.
        System.out.println("Задача 4");
        System.out.println("Число в 'полном виде': " + (x - unit) + "+" + unit); //число взял с задачи №3, там у меня реализован сканнер
        System.out.println("------------------------------------------------------");

//        Задача 5.
//        Назовем весом числа сумму его цифр.
//        Если x любое положительное двузначное число
//        Выведите на екран его «вес».
        System.out.println("Задача 5");
        System.out.println("Вес числа: " + (dec + unit)); //число взял с задачи №3, там у меня реализован сканнер
        System.out.println("------------------------------------------------------");

//        Задача 6.(со звездочкой)
//        Назовем «степенью четности» числа количество четных цифр в нем.
//        Например, для числа 4612 степень четности равна 3
//        (в его составе три четных цифры -4, 6 и 2).
//        Если x любое положительное двузначное число,
//        выведите на экран его «степень четности».
        System.out.println("Задача 6"); //число взял с задачи №3, там у меня реализован сканнер
        int quantity = 0;
        if (dec % 2 == 0) {
            quantity++;
        }
        if (unit % 2 == 0) {
            quantity++;
        }
        System.out.println("Степень чётности равна: " + quantity);
        System.out.println("------------------------------------------------------");

//        Задача 7.
//        Если x любое число,выведите на экран одно из следующих сообщений:
//        Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.
        System.out.println("Задача 7");

        System.out.println("Введите любое число");
        while (true) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                x = scanner2.nextInt();
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Вы ввели буквы. Введите положительное или отрицательное число");
            }
        }

        if (x > 0) {
            System.out.println("Вы ввели положительное число");
        } else if (x < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            System.out.println("Вы ввели ноль");
        }
        System.out.println("------------------------------------------------------");

//        Задача 8.
//        Если x любое число,
//        если оно как минимум трехзначное и положительное,
//        уменьшает его на 1 и выводит на экран.
        System.out.println("Задача 8");

        System.out.println("Введите любое число");
        while (true) {
            try {
                Scanner scanner3 = new Scanner(System.in);
                x = scanner3.nextInt();
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Вы ввели буквы. Введите положительное или отрицательное число");
            }
        }
        System.out.println("Вы ввели число " + x);
        if (x >= 100) {
            x -= 1;
            System.out.println("Ваше число уменьшенное на 1 = " + x);
        }else{
            System.out.println("Эх...Ваше число не трёхзначное и не положительное");
        }
        System.out.println("------------------------------------------------------");

//        Задача 9.
//        Если x любое положительное двузначное число выведите на экран что больше:
//        само это число или произведение его цифр.
        System.out.println("Задача 9");

        System.out.println("Введите положительное двухзначное число");
        x = 0;
        while (x < 10 || x >= 100) {
            try {
                Scanner scanner4 = new Scanner(System.in);
                x = scanner4.nextInt();
                if (x < 10 || x >= 100) {
                    System.out.println("Вы ввели число меньше 10 либо больше или равно 100");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Вы ввели буквы. Введите двухзначное положительное число");
            }
        }
        System.out.println("Вы ввели число " + x);

        unit = x % 10;
        dec = x / 10;
        int mul = unit * dec;

        if (x < mul){
            System.out.println("Произведение цифр числа X больше самого числа Х");
            //строка выше никогда не выведится, так как любое двухзначное число будет всегда больше произведения его чисел
        } else {
            System.out.println("Число Х больше произведения его цифр");
        }
    }
}


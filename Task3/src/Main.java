import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Циклы в Java:
//        Задача 1.
//        Создайте программу, выводящую на экран все четырёхзначные
//        числа последовательности 1000 1003 1006 1009 1012 1015
        System.out.println("Циклы в джава");
        System.out.println("Задача №1");

        for (int i = 1000; i <= 9999; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------------------------");

//        Задача 2.
//        Создайте программу, выводящую на экран
//        все неотрицательные элементы последовательности
//        10, 6, 2,-2,-6,-10
        System.out.println("Задача №2");
        System.out.println("Все неотрицательные элементы последовательности");
        for (int i = 10; i >= -10; i -= 4) {
            if (i > 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n-----------------------------------------------");

//        Задача 3.
//        Создайте программу, вычисляющую факториал натурального числа n,
//        которое пользователь введёт с клавиатуры.
//                https://javarush.ru/groups/posts/klass-scanner
//        Факториал числа n — это произведение натуральных чисел от 1 до n.
//        Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3
        System.out.println("Задача №3");
        System.out.println("Введите число: ");
        int number;
        int factorial = 1;

        while (true) {
            Scanner in = new Scanner(System.in);
            try {
                number = in.nextInt();
                if (number < 0) {
                    System.out.println("Введите число >= 0");
                    continue;
                }
                    break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Вы ввели буквы. Введите положительное число");
            }
        }
        System.out.print("Факториал числа " + number + " будет: ");
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.print(factorial);
        System.out.println("\n-----------------------------------------------");

//        Задача 4.
//        Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//        (заранее не известно сколько цифр будет в числе).
        System.out.println("Задача №4");
        System.out.println("Введите натуральное число");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();
        int sum = 0;

        while (enteredNumber != 0) {
            sum += (enteredNumber % 10);
            enteredNumber /= 10;
        }
        System.out.print("Сумма чисел введённого числа: " + sum);
        System.out.println("\n-----------------------------------------------");

//        Массивы:
//        Задача 1.
//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//                отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
//                Перед созданием массива подумайте, какого он будет размера.
//        2 4 6 … 18 20
//        2
//        4
//        6
//        …
//        20
        System.out.println("Массивы");
        System.out.println("Задача №1");
        int[] array = new int[10];
        int temp = 0;
        //Заполняем массив
        for (int i = 0; i < array.length; i++) {
            temp += 2;
            array[i] = temp;
        }

        //Выводим массив в строку
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Выводим массив в столбец
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------");

//        Задача 2.
//        Создайте массив из всех нечётных чисел от 1 до 99,
//                выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
//        но в обратном порядке (99 97 95 93 … 7 5 3 1).
        System.out.println("Задача №2");
        int[] oddArray = new int[50];
        int n = 1;
        //Заполняем массив
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = n;
            n += 2;
        }
        //Выводим массив в строку
        for (int j : oddArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        //Выводим массив в строку в обратном порядке
        for (int i = oddArray.length - 1; i >= 0; i--) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\n-----------------------------------------------");

//        Задача 3.(со звездочкой)
//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//                выведите массивы на экран в двух отдельных строках.
//                Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//                для какого из массивов это значение оказалось больше
//                (либо сообщите, что их средние арифметические равны).
        System.out.println("Задача №3");
        int[] array1 = new int[5];
        double sumArray1 = 0.0;
        double averageFirstArray;


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);
            System.out.print(array1[i] + " ");

            sumArray1 += array1[i];
        }
        //Cреднее арифметическое первого массива
        averageFirstArray = sumArray1 / array1.length;
        System.out.println();
        System.out.println("Cреднее арифметическое первого массива = " + averageFirstArray);
        System.out.println(" ");
        //Аналогично первому, создадим и выведем на экран второй массив
        int[] array2 = new int[5];
        double sumArray2 = 0.0;
        double averageSecondArray;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            System.out.print(array2[i] + " ");
            sumArray2 += array2[i];
        }
        //Cреднее арифметическое второго массива
        averageSecondArray = sumArray2 / array2.length;
        System.out.println();
        System.out.println("Cреднее арифметическое второго массива = " + averageSecondArray);
        //Сравним и выведем по условию средеарифметическое какого массива больше
        if (sumArray1 == sumArray2) {
            System.out.println("Средние арифметические значения двух массивов равны");
        } else if (sumArray1 > sumArray2) {
            System.out.println("Среднее арифметическое значение первого массива больше второго ");
        } else {
            System.out.println("Среднее арифметическое значение второго массива больше первого ");
        }
    }
}


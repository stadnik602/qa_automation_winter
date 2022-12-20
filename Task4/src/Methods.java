import java.util.Scanner;

public class Methods {
    public static int getInt() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char getOperation() {
        System.out.println("Введите символ операции (+, -, * или /)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return num1 / num2;
            }
        }
        return 0;
    }
}

//3) Реализовать простой калькулятор (+-/*)


import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        double res;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Недопустимая операция");
                return;
        }
        System.out.println(a + " " + op + " " + b + " = " + res);
    }
}

package homework.hw3.ex03;

import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations calculator = new MathOperations();

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите операцию (+, -, *, /, ^): ");
        String operation = scanner.next();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        try {
            double result = 0;
            switch (operation) {
                case "+":
                    result = calculator.add(a, b);
                    break;
                case "-":
                    result = calculator.subtract(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    result = calculator.divide(a, b);
                    break;
                case "^":
                    result = calculator.power(a, b);
                    break;
                default:
                    throw new InvalidInputException("Неверная операция");
            }
            System.out.println("Результат: " + result);
        } catch (ArithmeticException | InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}

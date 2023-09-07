package seminars.sem2.ex04;

import seminars.sem2.ex01.DivisionByZeroException;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое положительное число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе положительное число: ");
        int num2 = scanner.nextInt();

        try {

            System.out.println("Выберите операцию (- для вычитания, * для умножения): ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '-':
                    if (num1 < 0) {
                        throw new NegativeNumbersException("Нельзя вычитать из отрицательного числа.");
                    }
                    int minusResult = num1 - num2;
                    System.out.println("Результат вычитания: " + minusResult);
                    break;
                case '*':
                    if (num1 == 0 || num2 == 0) {
                        throw new MultiplicationByZeroException("Умножение на ноль недопустимо");
                    }
                    int multiResult = num1 * num2;
                    System.out.println("Результат умножения: " + multiResult);
                    break;
                default:
                    System.out.println("Некорректная операция");
            }

        } catch (NegativeNumbersException | MultiplicationByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();

    }

}

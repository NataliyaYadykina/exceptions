package homework.hw2.ex02;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        try {
            if (num2 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            double divisionResult = (double) num1 / num2;
            System.out.println("Результат деления: " + divisionResult);

        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();

    }

}

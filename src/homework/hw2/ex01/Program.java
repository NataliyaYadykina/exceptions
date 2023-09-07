package homework.hw2.ex01;

import java.util.Scanner;
/*
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
 */
public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        try {
            if (num <= 0) {
                throw new InvalidNumberException("Некорректное число!");
            }
            System.out.println("Число корректно: " + num);
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();

    }

}

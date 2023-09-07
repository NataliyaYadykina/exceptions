package homework.hw1;

class Answer1 {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1, 2, 3, 4};
        arr[7] = 10;
    }

    public static void divisionByZero() {
        int a = 2;
        int b = 0;
        double c = a / b;

    }

    public static void numberFormatException() {
        String str = "abc";
        int num = Integer.parseInt(str);

    }
}

public class Printer1 {
    public static void main(String[] args) {
        Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
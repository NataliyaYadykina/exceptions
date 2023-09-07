package seminars.sem1;

public class Ex2 {

    public static void main(String[] args) {

        int[] num1 = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] num2 = { 2, 0, 4, 4, 0, 8 };

        try {
            for (int i = 0; i < num1.length; i++) {
                try {
                    System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Trying to divide by zero.");
                }

//            try {
//                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
//            } catch (Throwable exception) { // родительский главный тип исключений
//                System.out.println("Throwable.");
//            }

//            try {
//                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
//            } catch (Exception exception) { // внутреннее исключение, наследник Throwable (еще один наследник Error - на которые не можем повлиять, внешние, например)
//                System.out.println("Exception.");
//            }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index is out of bounds.");
        }

    }

}

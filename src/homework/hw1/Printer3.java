package homework.hw1;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        int result[] = new int[0];
        
        if (a.length == b.length) {
            
            try {
                int[] c = new int[a.length];
                for (int i = 0; i < c.length; i++) {
                    c[i] = a[i] / b[i];
                    if (b[i] == 0) {
                        throw new RuntimeException("Деление на ноль невозможно.");
                    }
                }
                result = c;
            } catch (ArithmeticException exception) {
                System.out.println("ArithmeticException caught: " + exception.getMessage());
            }


        } else {
            int[] c = new int[1];
            result = c;
        }
        
    return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 0, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer1 ans = new Answer1();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
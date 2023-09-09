package homework.hw3.ex03;

public class MathOperations {

    /**
     * Метод, который выполняет сложение двух чисел.
     *
     * @param a Первое число для сложения.
     * @param b Второе число для сложения.
     * @return Результат сложения a и b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Метод, который выполняет вычитание двух чисел.
     *
     * @param a Уменьшаемое число.
     * @param b Вычитаемое число.
     * @return Результат вычитания b из a.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Метод, который выполняет умножение двух чисел.
     *
     * @param a Первый множитель.
     * @param b Второй множитель.
     * @return Результат умножения a на b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Метод, который выполняет деление двух чисел.
     *
     * @param a Делимое число.
     * @param b Делитель.
     * @return Результат деления a на b.
     * @throws ArithmeticException Если делитель b равен нулю.
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return a / b;
    }

    /**
     * Метод, который выполняет возведение в степень.
     *
     * @param a Делимое число.
     * @param b Степень.
     * @return Результат возведения a в степень b.
     */
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}

package homework.hw3.ex01;

import java.util.regex.Pattern;

/*
Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод,
который принимает строку пароля и проверяет его на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
 */
public class PasswordVerifier {

    public static void main(String[] args) {
        String password = "Passw0rd!";
        PasswordVerifier verifier = new PasswordVerifier();
        try {
            verifier.verifyPassword(password);
            System.out.println("Valid password: " + password);
        } catch (InvalidPasswordException e) {
            System.err.println("Invalid password: " + password + " - " + e.getMessage());
        }
    }

    private void verifyPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Пароль должен содержать не менее 8 символов.");
        }
        if (!Pattern.compile("\\d").matcher(password).find()) {
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру.");
        }
        if (!Pattern.compile("([A-Z])").matcher(password).find()) {
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну заглавную букву.");
        }
    }
}

package homework.hw3.ex02;

/*
Задача 2: Файловый менеджер (ООП, исключения)
---------------------------------------------
Создайте класс FileManager.
Этот класс должен иметь методы для выполнения основных операций с файлами: чтение, запись и копирование.
Каждый из этих методов должен выбрасывать соответствующее исключение,
если в процессе выполнения операции произошла ошибка
(например, FileNotFoundException, если файл не найден).
 */

public class Program {

    public static void main(String[] args) {

        FileManager fm = new FileManager();

        try {
            fm.readFile("src/homework/hw3/ex02/reader.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fm.writeFile("src/homework/hw3/ex02/writer.txt", "some text\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fm.readFile("src/homework/hw3/ex02/writer.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fm.copyFile("src/homework/hw3/ex02/reader.txt", "src/homework/hw3/ex02/copy.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fm.readFile("src/homework/hw3/ex02/copy.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

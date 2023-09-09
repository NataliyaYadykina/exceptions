package homework.hw3.ex02;

import java.io.*;

public class FileManager {
    public void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден: " + filePath);
        }
        // чтение файла
        FileReader reader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public void writeFile(String filePath, String content) throws IOException {
        File file = new File(filePath);
//        file.setReadOnly(); // запретим запись в файл
        if (file.exists() && !file.canWrite()) {
            throw new IOException("Файл существует и не является доступным для записи: " + filePath);
        }
        // запись в файл
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(content);
        writer.close();
    }

    public void copyFile(String sourceFilePath, String destFilePath) throws IOException {
        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath);

//        destFile.setReadOnly(); // запретим запись в файл

        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Исходный файл не найден: " + sourceFilePath);
        } else if (destFile.exists() && !destFile.canWrite()) {
            throw new IOException("Конечный файл существует и недоступен для записи: " + destFilePath);
        }

        FileReader reader = new FileReader(sourceFilePath);
        FileWriter writer = new FileWriter(destFilePath);

        while (reader.ready()) {
            writer.write(reader.read());
        }

        reader.close();
        writer.close();

    }

}

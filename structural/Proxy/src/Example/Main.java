package Example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Создаем прокси для доступа к файлу
        FileAccess proxy1 = new FileAccessProxy("/tmp/myfile.txt");
        FileAccess proxy2 = new FileAccessProxy("/etc/passwd"); // Этот файл, вероятно, не будет доступен

        try {
            System.out.println(proxy1.readFromFile()); // Доступ разрешен
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        try {
            System.out.println(proxy2.readFromFile()); // Доступ запрещен
        } catch (SecurityException e) {
            System.err.println("Security Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

package Example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class FileLineIterator implements Iterator<String>, AutoCloseable { //Добавили AutoCloseable
    private BufferedReader reader;
    private String nextLine;

    FileLineIterator(String filename) throws IOException {
        reader = new BufferedReader(new FileReader(filename));
        nextLine = reader.readLine();
    }

    @Override
    public boolean hasNext() {
        return nextLine != null;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String line = nextLine;
        try {
            nextLine = reader.readLine();
        } catch (IOException e) {
            nextLine = null; // Обработка ошибки чтения
            // В реальном приложении здесь лучше бы выбросить исключение,
            // но для простоты примера мы просто установим nextLine в null
        }
        return line;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(); // Удаление строк из файла не поддерживается
    }

    @Override
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String filename = "my_file.txt"; // Замените на имя вашего файла

        try (FileLineIterator iterator = new FileLineIterator(filename)) { // Используем try-with-resources
            while (iterator.hasNext()) {
                String line = iterator.next();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
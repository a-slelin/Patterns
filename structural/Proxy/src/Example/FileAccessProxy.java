package Example;

import java.io.IOException;

class FileAccessProxy implements FileAccess {
    private RealFileAccess realFileAccess;
    private String filePath;
    private boolean accessGranted; // Флаг доступа

    public FileAccessProxy(String filePath) {
        this.filePath = filePath;
        //Проверка доступа (в реальном приложении это может быть более сложная проверка)
        accessGranted = filePath.startsWith("/tmp/"); //Пример: доступ только к файлам в /tmp
    }

    @Override
    public String readFromFile() throws IOException {
        if (accessGranted) {
            if (realFileAccess == null) {
                realFileAccess = new RealFileAccess(filePath);
            }
            return realFileAccess.readFromFile();
        } else {
            throw new SecurityException("Access denied!");
        }
    }
}
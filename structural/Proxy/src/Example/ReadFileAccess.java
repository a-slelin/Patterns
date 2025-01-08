package Example;

import java.io.*;

class RealFileAccess implements FileAccess {
    private String filePath;

    public RealFileAccess(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String readFromFile() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}

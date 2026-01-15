import java.nio.file.*;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {
        Path out = Paths.get("output.txt");
        String text = "Hello from FileIODemo\n";
        try {
            Files.writeString(out, text);
            String read = Files.readString(out);
            System.out.println("Wrote and read: " + read.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

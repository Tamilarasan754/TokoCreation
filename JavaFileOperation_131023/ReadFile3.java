import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile3 {

    public static void main(String[] args) throws IOException {

        String fileName = "D:/Tamil/v2.txt";

        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);

    }
}
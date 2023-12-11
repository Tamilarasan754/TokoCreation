import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile4 {

    public static void main(String[] args) throws IOException {

        String fileName = "D:/Tamil/v2.txt";

        List<String> lines = Files.readAllLines(Paths.get(fileName),
                                                  StandardCharsets.UTF_8);
        lines.forEach(System.out::println);

    }
}
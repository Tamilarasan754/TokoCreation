import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileUsingStream {
    public static void main(String[] args) throws Exception
    {
        // Specify the path to the file you want to read
        String filePath = "D:/Tamil/v2.txt";

        // Use try-with-resources to automatically close the stream
       Stream<String> lines = Files.lines(Paths.get(filePath));
     // BufferedReader reader1=new BufferedReader(new Reader(lines));
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

       String[] col=reader.lines(). 
            // Process each line using lambda expression
            //lines.forEach(System.out::println);

        
    }
}

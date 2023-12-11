import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorExample {
    public static void main(String[] args) {
        // Create an array
        String[] words = {"apple", "banana", "orange", "grapes", "kiwi"};

        // Get a Spliterator for the array
        Spliterator<String> spliterator = Arrays.spliterator(words);

        // Try splitting the Spliterator
        Spliterator<String> splitSpliterator = spliterator.trySplit();

        // Process the first half of the Spliterator
        System.out.println("First Half:");
        processSpliterator(spliterator);

        // Process the second half of the Spliterator
        System.out.println("\nSecond Half:");
        processSpliterator(splitSpliterator);
    }

    // Helper method to process a Spliterator
    private static void processSpliterator(Spliterator<String> spliterator) {
        // Use tryAdvance to iterate over the elements
        spliterator.forEachRemaining(System.out::println);
    }
}

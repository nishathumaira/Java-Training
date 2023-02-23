import java.time.Year;
import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = Year.now().getValue();

        // Create a stream of integers from 1960 to the current year
        IntStream.rangeClosed(1960, currentYear)

            // Filter the stream to include only leap years
            .filter(year -> Year.of(year).isLeap())

            // Print out each leap year to the console
            .forEach(year -> System.out.println(year));
    }
}

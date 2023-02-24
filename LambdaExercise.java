package Java-Training;

import java.time.Year;
import java.util.stream.IntStream;

public class LambdaExercise {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        IntStream.rangeClosed(1960, currentYear)
            .filter(year -> (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            .forEach(year -> System.out.println(year));
    }
}

package lambda;
import java.util.Arrays;
public class Squares {

        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            double average = Arrays.stream(numbers)
                    .filter(n -> n % 2 != 0) // Filter odd numbers
                    .mapToDouble(n -> Math.pow(n, 2)) // Square each odd number
                    .average() // Calculate the average
                    .orElse(0); // Default value if no odd numbers are found

            System.out.println("Average of squares of odd numbers: " + average);
        }
    }



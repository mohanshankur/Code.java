package lambda;
import java.util.Arrays;


import java.util.List;

public class Squares {

        public static int calculateSumOfSquares(List<Integer> numbers) {
            return numbers.stream()
                    .filter(num -> num > 0) // Filter out negative numbers
                    .mapToInt(num -> num * num) // Square each positive number
                    .sum(); // Sum up the squares
        }
    }



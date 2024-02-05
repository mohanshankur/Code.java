package lambda;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class EvenNumbers {

        public static List<Integer> doubleOddNumbers(List<Integer> numbers) {
            return numbers.stream()
                    .filter(n -> n % 2 != 0) // Filter out even numbers
                    .map(n -> n * 2) // Double each remaining number
                    .collect(Collectors.toList()); // Collect the results into a list
        }

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> doubledOddNumbers = doubleOddNumbers(numbers);
            System.out.println("Doubled odd numbers: " + doubledOddNumbers);
        }
    }



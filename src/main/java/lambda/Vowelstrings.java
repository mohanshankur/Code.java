package lambda;
import java.util.Arrays;
public class Vowelstrings {



        public static void main (String[] args) {
            String[] arr = {"hello", "world", "java", "programming", "array", "open"};

            Arrays.stream(arr)
                    .filter(s -> s.toLowerCase().chars().anyMatch(c -> "aeiou".indexOf(c) != -1))
                    .forEach(s -> {
                        long vowelCount = s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
                        System.out.println("String: " + s + ", Number of vowels: " + vowelCount);
                    });
        }
    }



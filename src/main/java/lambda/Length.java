package lambda;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Length {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "pear", "kiwi");

            Map<Integer, List<String>> groupedByLength = strings.stream()
                    .collect(Collectors.groupingBy(String::length));

            groupedByLength.forEach((length, words) -> {
                System.out.println("Strings with length " + length + ": " + words);
            });
        }
    }


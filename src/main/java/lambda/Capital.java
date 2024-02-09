package lambda;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

        public class Capital {

            public static List<String> capitalizeAndSortStrings(String[] strings) {
                return Arrays.stream(strings)
                        .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                        .sorted()
                        .collect(Collectors.toList());
            }
        }



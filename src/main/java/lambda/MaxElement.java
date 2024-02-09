package lambda;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

        public class MaxElement {

            public static Optional<String> findMax(List<String> strings) {
                return strings.stream()
                        .max(String::compareTo);
            }
        }

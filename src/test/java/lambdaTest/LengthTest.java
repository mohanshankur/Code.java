package lambdaTest;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;

public class LengthTest {

        @Test
        public void testGroupByLength() {
            List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "pear", "kiwi");

            Map<Integer, List<String>> expected = strings.stream()
                    .collect(Collectors.groupingBy(String::length));

            Map<Integer, List<String>> actual = groupedByLength.groupByLength(strings);

            assertEquals(expected, actual);
        }
    }


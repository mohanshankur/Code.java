package lambdaTest;


import lambda.Length;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;


public class LengthTest {
        @org.junit.Test
        public void testGroupStringsByLength() {
            List<String> input = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
            Map<Integer, List<String>> expected = Map.of(
                    5, Arrays.asList("apple", "grape"),
                    6, Arrays.asList("banana", "orange"),
                    4, Arrays.asList("kiwi")
            );

            Map<Integer, List<String>> result = Length.StringGroupByLength.groupStringsByLength(input);

            assertEquals(expected, result);
        }
    }




package lambdaTest;


import lambda.Capital;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class CapitalTest {

        @Test
        public void testCapitalizeAndSortStrings() {
            String[] input = {"apple", "banana", "orange", "grape"};
            String[] expected = {"Apple", "Banana", "Grape", "Orange"};

            Capital CapitalizeAndSortStrings = null;
            List<String> result = CapitalizeAndSortStrings.capitalizeAndSortStrings(input);

            assertEquals(expected.length, result.size());
            for (int i = 0; i < expected.length; i++) {
                assertEquals(expected[i], result.get(i));
            }
        }
    }


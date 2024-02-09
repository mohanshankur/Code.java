package lambdaTest;

import lambda.EvenNumbers;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

    public class EvenNumbersTest {

        @Test
        public void testDoubleOddNumbers() {
            // Input list containing both even and odd numbers
            List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Expected output list after doubling the odd numbers
            List<Integer> expectedOutput = Arrays.asList(2, 6, 10, 14, 18);

            // Calling the method to be tested
            EvenNumbers EvenNumberDoubler = null;
            List<Integer> actualOutput = EvenNumberDoubler.doubleOddNumbers(input);

            // Asserting that the actual output matches the expected output
            assertEquals(expectedOutput, actualOutput);
        }
    }


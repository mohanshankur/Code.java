package additionalTest;

import additional.ArraySum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySumTest {

        @Test
        public void testCalculateSum() {
            int[] array = {1, 2, 3, 4, 5};
            int expectedSum = 15; // Expected sum of elements in the array

            // Call the calculateSum method and store the result
            int actualSum = ArraySum.calculateSum(array);

            // Assert that the actual sum matches the expected sum
            assertEquals(expectedSum, actualSum);
        }
    }



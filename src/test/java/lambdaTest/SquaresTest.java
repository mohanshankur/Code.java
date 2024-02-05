package lambdaTest;


    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class SquaresTest {

        @Test
        public void testAverageOfSquaresOfOddNumbers() {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            double expectedAverage = 140.0; // Expected average of squares of odd numbers

            double actualAverage = Main.calculateAverageOfSquaresOfOddNumbers(numbers);

            assertEquals(expectedAverage, actualAverage, 0.01); // Asserting with a delta for floating-point precision
        }
    }



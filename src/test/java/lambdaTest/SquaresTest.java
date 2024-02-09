package lambdaTest;



import lambda.Squares;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

    public class SquaresTest {

        @Test
        public void testCalculateSumOfSquares() {
            List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5);
            Squares SumOfSquaresCalculator = null;
            int sumOfSquares = SumOfSquaresCalculator.calculateSumOfSquares(numbers);
            assertEquals(35, sumOfSquares);
        }
    }



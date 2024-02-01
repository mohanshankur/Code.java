package AdditionalTest;

import Additional.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    void testCalculateFactorialWithPositiveNumber() {
        int number = 5;
        long expectedFactorial = 120; // Expected factorial of 5

        // Call the calculateFactorial method and store the result
        long actualFactorial = Factorial.calculateFactorial(number);

        // Assert that the actual factorial matches the expected factorial
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialWithZero() {
        int number = 0;
        long expectedFactorial = 1; // Expected factorial of 0

        // Call the calculateFactorial method and store the result
        long actualFactorial = Factorial.calculateFactorial(number);

        // Assert that the actual factorial matches the expected factorial
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialWithNegativeNumber() {
        int negativeNumber = -5;

        // Assert that calculateFactorial throws IllegalArgumentException for negative numbers
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(negativeNumber));
    }
}


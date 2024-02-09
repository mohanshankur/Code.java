package lambdaTest;

import lambda.StringFilter;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        // Given
        List<String> input = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");
        Predicate<String> startsWithAPredicate = s -> s.startsWith("A");

        // When
        List<String> filteredStrings = StringFilter.filterStringsStartingWithA(input, startsWithAPredicate);

        // Then
        List<String> expected = Arrays.asList("Apple", "Avocado");
        assertEquals(expected, filteredStrings);
    }
}


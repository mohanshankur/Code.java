package lambdaTest;


import lambda.AscendingDescending;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class AscendingDescendingTest {

    @Test
    public void testSortStrings() {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] expected = {"kiwi", "grape", "apple", "banana", "orange"};
        AscendingDescending StringSorter = new AscendingDescending();
        StringSorter.sortStrings(strings);
        assertArrayEquals(expected, strings);
    }
}


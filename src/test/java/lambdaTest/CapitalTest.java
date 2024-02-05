package lambdaTest;


import org.junit.Test;
import static org.junit.Assert.*;



public class CapitalTest {

        @Test
        public void testCapitalizeFirstLetter() {
            assertEquals("Apple", CapitalizeAndSortStrings.capitalizeFirstLetter("apple"));
            assertEquals("Banana", CapitalizeAndSortStrings.capitalizeFirstLetter("banana"));
            assertEquals("Orange", CapitalizeAndSortStrings.capitalizeFirstLetter("orange"));
            assertEquals("Grape", CapitalizeAndSortStrings.capitalizeFirstLetter("grape"));
            assertEquals("", CapitalizeAndSortStrings.capitalizeFirstLetter(""));
            assertEquals("A", CapitalizeAndSortStrings.capitalizeFirstLetter("a"));
            assertEquals("123", CapitalizeAndSortStrings.capitalizeFirstLetter("123"));
        }

        @Test
        public void testSortAndCapitalizeStrings() {
            String[] input = {"apple", "banana", "orange", "grape"};
            String[] expected = {"Apple", "Banana", "Grape", "Orange"};
            assertArrayEquals(expected, CapitalizeAndSortStrings.sortAndCapitalizeStrings(input));
        }
    }


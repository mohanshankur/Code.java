
package Arraylist;

import Arraylist.ArrayListToArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ArrayListToArrayTest {

    @Test
    public void testPrintArray() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        String[] expected = {"Apple", "Banana", "Orange", "Grapes"};
        String[] result = ArrayListToArray.convertArrayListToArray(fruits);

        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testEmptyArrayList() {
        ArrayList<String> emptyList = new ArrayList<>();

        String[] result = ArrayListToArray.convertArrayListToArray(emptyList);

        String[] expected = {};

        assertEquals(expected.length, result.length);
    }
}
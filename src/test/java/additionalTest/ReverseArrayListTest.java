package additionalTest;

import additional.ReverseArrayList;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseArrayListTest {

    @Test
    public void testReverseArrayList() {

        List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversedList = ReverseArrayList.reverseArrayList(originalList);
        List<Integer> expectedList = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expectedList, reversedList);

        List<Integer> originalList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> reversedList1 = ReverseArrayList.reverseArrayList(originalList1);
        List<Integer> expectedList1 = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
        assertEquals(expectedList1, reversedList1);

    }

}

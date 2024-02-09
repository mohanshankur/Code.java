package lambdaTest;


import lambda.Removeduplicate;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

    public class RemoveduplicateTest {

        @Test
        public void testRemoveDuplicates() {
            List<Integer> input = List.of(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9);
            List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

            Removeduplicate RemoveDuplicatesUsingStreams = null;
            List<Integer> result = RemoveDuplicatesUsingStreams.removeDuplicates(input);
            assertEquals("Removing duplicates failed", expected, result);
        }
    }

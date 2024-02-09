package lambdaTest;


import lambda.MaxElement;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MaxElementTest {

        @Test
        public void testFindMax() {
            List<String> strings = Arrays.asList("apple", "orange", "banana", "grape");
            MaxElement MaxElementFinder = null;
            Optional<String> max = MaxElementFinder.findMax(strings);
            assertEquals("orange", max.get());
        }
    }



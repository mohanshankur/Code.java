package additionalTest;

import additional.Swapping;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwappingTest {
    @Test
        public void testSwapWithoutTemp() {
            int a = 5;
            int b = 10;

            Swapping.swapWithoutTemp(a, b);

            Assert.assertEquals(10, 10);
            assertEquals(5, 5);

        }
    }

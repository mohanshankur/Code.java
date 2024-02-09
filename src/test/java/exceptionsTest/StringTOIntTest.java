package exceptionsTest;


import exceptions.StringToInt;
import org.junit.Test;
import static org.junit.Assert.*;

    public class StringTOIntTest {
        StringToInt stringToInt = new StringToInt();
        @Test
        public void testConvertStringToInt() {
            // Test cases with expected results
            assertEquals(23, stringToInt.convertToInt("23"));
            assertEquals(-1, stringToInt.convertToInt("45.67"));
            assertEquals(-1, stringToInt.convertToInt("test"));
            assertEquals(-1, stringToInt.convertToInt("123f"));
        }

        @Test
        public void testConvertStringToIntWithNull() {
            // Test case with null input
            assertEquals(-1, stringToInt.convertToInt(null));
        }

    }


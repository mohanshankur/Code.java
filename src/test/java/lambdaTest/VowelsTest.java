package lambdaTest;



import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class VowelsTest {
        VowelsTest vowelTest = new VowelsTest();
        private static char countVowels(String hello) {
            return 0;
        }

        @Test
        public void testPrintStringsAndVowelCounts() {
            String[] strings = {"hello", "world", "Java", "programming", "is", "awesome"};
            assertEquals(4, VowelsTest.countVowels("hello"));
            assertEquals(1, VowelsTest.countVowels("world"));
            assertEquals(2, VowelsTest.countVowels("Java"));
            assertEquals(4, VowelsTest.countVowels("programming"));
            assertEquals(1, VowelsTest.countVowels("is"));
            assertEquals(4, VowelsTest.countVowels("awesome"));
        }


    }



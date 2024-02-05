package additionalTest;

import additional.RepeatedChars;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RepeatedCharsTest {
    @Test
    public void testrepeatedChar() {
        String input1 = "abacabad";
        String expected1 = "ab";
        assertEquals(expected1, RepeatedChars.isrepeatedChar(input1));


        String input2 = "hello";
        String expected2 = "l";
        assertEquals(expected2, RepeatedChars.isrepeatedChar(input2));


        String input3 = "programming";
        String expected3 = "rgm";
        assertEquals(expected3, RepeatedChars.isrepeatedChar(input3));


        String input4 = "abcdefg";
        String expected4 = "ab";
        assertNotEquals(expected4, RepeatedChars.isrepeatedChar(input4));

    }
}

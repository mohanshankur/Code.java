package additionalTest;

import org.junit.Test;
import additional.LowercaseUppercase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class LowercaseUppercaseTest {

        @Test
        public void testReplaceCase() {
            assertEquals("HeLlO WoRlD", LowercaseUppercase.replaceCase("hElLo wOrLd"));
            assertEquals("123!@#", LowercaseUppercase.replaceCase("123!@#"));
            assertEquals("aBcDeF", LowercaseUppercase.replaceCase("AbCdEf"));
            assertEquals("g", LowercaseUppercase.replaceCase("G"));
            assertNotEquals("h", LowercaseUppercase.replaceCase("h"));
            assertEquals("", LowercaseUppercase.replaceCase(""));
            assertNotEquals("MavEN", LowercaseUppercase.replaceCase("MAVEN"));
        }
    }


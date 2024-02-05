package lambdaTest;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    public class VowelstringsTest {

        @Test
        public void testCountVowels() {
            // Arrange
            String str1 = "Hello";
            String str2 = "World";
            String str3 = "Java";
            String str4 = "Programming";
            String str5 = "Example";


            // Act
            int count1 = Main.countVowels(str1);
            int count2 = Main.countVowels(str2);
            int count3 = Main.countVowels(str3);
            int count4 = Main.countVowels(str4);
            int count5 = Main.countVowels(str5);

            // Assert
            assertEquals(2, count1); // "Hello" has 2 vowels ('e' and 'o')
            assertEquals(1, count2); // "World" has 1 vowel ('o')
            assertEquals(2, count3); // "Java" has 2 vowels ('a' and 'a')
            assertEquals(3, count4); // "Programming" has 3 vowels ('o', 'a', and 'i')
            assertEquals(4, count5); // "Example" has 4 vowels ('e', 'a', 'm', and 'e')
        }
    }



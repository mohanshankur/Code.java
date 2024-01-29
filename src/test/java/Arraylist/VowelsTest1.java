package Arraylist;

public class VowelsTest1 {

    public static void main(String[] args) {
        testCountVowels();
    }

    static void testCountVowels() {
        // Test Case 1: All uppercase vowels
        String inputString1 = "MOHAN";
        int expectedVowelCount1 = 2;  // 'O' and 'A'
        assert countVowels(inputString1) == expectedVowelCount1 : "Test Case 1 Failed";

        // Test Case 2: All lowercase vowels
        String inputString2 = "aeiou";
        int expectedVowelCount2 = 5;  // All vowels are present
        assert countVowels(inputString2) == expectedVowelCount2 : "Test Case 2 Failed";

        // Test Case 3: Mixed case vowels
        String inputString3 = "Hello World";
        int expectedVowelCount3 = 3;  // 'e', 'o', and 'o'
        assert countVowels(inputString3) == expectedVowelCount3 : "Test Case 3 Failed";

        // Test Case 4: No vowels
        String inputString4 = "Rhythm";
        int expectedVowelCount4 = 0;  // No vowels in the word
        assert countVowels(inputString4) == expectedVowelCount4 : "Test Case 4 Failed";

        System.out.println("All test cases passed!");
    }

    static int countVowels(String inputString) {
        inputString = inputString.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}

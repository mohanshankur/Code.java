package strings;

public class ReverseWord {

    public static void main(String[] args) {
        testReverseWords();
    }

    static void testReverseWords() {
        // Test Case 1: Normal sentence
        String inputSentence1 = "Java J2EE Reverse Me";
        String expectedReversedSentence1 = "avaJ E2J Reverse eM";
        assert reverseWords(inputSentence1).equals(expectedReversedSentence1) : "Test Case 1 Failed";

        // Test Case 2: Sentence with multiple spaces between words
        String inputSentence2 = "  Hello    World   ";
        String expectedReversedSentence2 = "olleH dlroW";
        assert reverseWords(inputSentence2).equals(expectedReversedSentence2) : "Test Case 2 Failed";

        // Test Case 3: Empty sentence
        String inputSentence3 = "";
        String expectedReversedSentence3 = "";
        assert reverseWords(inputSentence3).equals(expectedReversedSentence3) : "Test Case 3 Failed";

        // Test Case 4: Single-word sentence
        String inputSentence4 = "Palindrome";
        String expectedReversedSentence4 = "emordnilaP";
        assert reverseWords(inputSentence4).equals(expectedReversedSentence4) : "Test Case 4 Failed";

        System.out.println("All test cases passed!");
    }

    static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}

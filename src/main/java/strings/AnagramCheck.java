package strings;
import strings.AnagramCheck;

import java.util.Arrays;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        testAreAnagrams();
    }

    static void testAreAnagrams() {
        // Test Case 1: Anagrams
        String str1 = "listen";
        String str2 = "silent";
        assert areAnagrams(str1, str2) : "Test Case 1 Failed";

        // Test Case 2: Non-Anagrams
        String str3 = "hello";
        String str4 = "world";
        assert !areAnagrams(str3, str4) : "Test Case 2 Failed";

        // Test Case 3: Anagrams with different cases
        String str5 = "Listen";
        String str6 = "Silent";
        assert areAnagrams(str5, str6) : "Test Case 3 Failed";

        // Test Case 4: Anagrams with spaces
        String str7 = "debit card";
        String str8 = "bad credit";
        assert areAnagrams(str7, str8) : "Test Case 4 Failed";

        // Test Case 5: Anagrams with special characters
        String str9 = "rat!";
        String str10 = "tar!";
        assert areAnagrams(str9, str10) : "Test Case 5 Failed";

        System.out.println("All test cases passed!");
    }

    static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}






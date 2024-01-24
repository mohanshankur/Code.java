package strings;

public class Rotation {

    public static void main(String[] args) {
        testRotation();
    }

    static void testRotation() {
        // Test Case 1: Rotated strings
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        assert isRotation(str1, str2) : "Test Case 1 Failed";

        // Test Case 2: Non-rotated strings
        String str3 = "Hello";
        String str4 = "World";
        assert !isRotation(str3, str4) : "Test Case 2 Failed";

        // Test Case 3: Empty string
        String str5 = "";
        String str6 = "";
        assert !isRotation(str5, str6) : "Test Case 3 Failed";

        // Test Case 4: Unequal lengths
        String str7 = "abc";
        String str8 = "defg";
        assert !isRotation(str7, str8) : "Test Case 4 Failed";

        // Test Case 5: Same string
        String str9 = "same";
        String str10 = "same";
        assert isRotation(str9, str10) : "Test Case 5 Failed";

        System.out.println("All test cases passed!");
    }

    static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}

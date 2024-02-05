package additional;

public class Palindrome {

        public static boolean isPalindrome(int number) {
            int reversed = 0;
            int original = number;

            if (number < 0) {
                return false;
            }
            else if (number == 0) {
                return false;
            }
            else if (number > 0) {
                while (number != 0) {
                    int digit = number % 10;
                    reversed = reversed * 10 + digit;
                    number /= 10;
                }

            }
            return original == reversed;
        }
    }


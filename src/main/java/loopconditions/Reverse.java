package loopconditions;

public class Reverse {

        static int reverse(int number){
            int reverseNumber = 0;
            while(number > 0){
                int remainder = number % 10;
                reverseNumber = reverseNumber * 10 + remainder;
                number /= 10;
            }
            return  reverseNumber;
        }

        public static void main(String[] args) {
            System.out.println(reverse(12345));

        }
    }


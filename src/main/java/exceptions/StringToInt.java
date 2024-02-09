package exceptions;

public class StringToInt {

        public int convertToInt(String input) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Exception occurred: " + e.getMessage());
                return -1; // or any default value you want to return
            }
        }


    }


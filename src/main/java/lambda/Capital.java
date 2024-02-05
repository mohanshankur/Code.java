package lambda;


import java.util.Arrays;

    public class Capital {
        public static void main(String[] args) {
            // Given array of Strings
            String[] strings = {"apple", "banana", "orange", "grape"};

            // Capitalize the first letter of each String and sort the array
            Arrays.sort(strings);

            // Print the capitalized and sorted strings
            for (String str : strings) {
                System.out.println(capitalizeFirstLetter(str));
            }
        }

        // Method to capitalize the first letter of a String
        private static String capitalizeFirstLetter(String str) {
            // Check if the string is not empty
            if (!str.isEmpty()) {
                // Capitalize the first letter and return the modified string
                return Character.toUpperCase(str.charAt(0)) + str.substring(1);
            }
            // Return the unchanged string if it is empty
            return str;
        }
    }


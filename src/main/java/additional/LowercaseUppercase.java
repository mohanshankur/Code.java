package additional;

public class LowercaseUppercase {

        public static String replaceCase(String input) {
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    result.append(Character.toUpperCase(c));
                } else if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        }
    }


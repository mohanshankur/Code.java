package additional;



    import java.util.ArrayList;
import java.util.List;

    public class RepeatedChars {
        public static  String isrepeatedChar(String s) {
            s=s.toLowerCase();
            char[] charArray = s.toCharArray();
            List<Character> repeatList = new ArrayList<>();

            for (int i = 0; i <s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (charArray[i] == charArray[j] && !repeatList.contains(charArray[i])){
                        repeatList.add(charArray[i]);

                    }
                }

            }
            StringBuilder result = new StringBuilder();
            for (Character c : repeatList) {
                result.append(c);

            }
            return result.toString();
        }
}

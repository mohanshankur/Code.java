package additional;

public class Rotation {


    public static boolean Rotations(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }
}



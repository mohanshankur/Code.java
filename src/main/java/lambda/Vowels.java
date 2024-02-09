package lambda;


    import java.util.Arrays;

    public class Vowels {

        public static boolean containsVowels(String str) {
            return str.chars().anyMatch(c -> "aeiouAEIOU".indexOf(c) != -1);
        }

        public static void printStringsAndVowelCounts(String[] strings) {
            Arrays.stream(strings)
                    .filter(Vowels::containsVowels)
                    .forEach(str -> {
                        long vowelCount = str.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
                        System.out.println(str + " - " + vowelCount + " vowels");
                    });
        }
    }



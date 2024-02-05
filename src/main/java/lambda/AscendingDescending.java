package lambda;



import java.util.Arrays;
import java.util.Comparator;


public class AscendingDescending {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};
        sortStrings(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparing(String::length)
                .thenComparing(Comparator.comparing(String::charAt)
                        .reversed()));
    }
}






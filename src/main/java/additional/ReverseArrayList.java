package additional;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}

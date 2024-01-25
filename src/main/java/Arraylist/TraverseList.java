package Arraylist;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TraverseList {

    public static List<String> traverseListRegularForLoop(ArrayList<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            result.add(element);
        }
        return result;
    }

    public static List<String> traverseListEnhancedForLoop(ArrayList<String> list) {
        List<String> result = new ArrayList<>();
        for (String element : list) {
            result.add(element);
        }
        return result;
    }
}

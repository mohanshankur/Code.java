package Arraylist;




import java.util.ArrayList;

public class ArrayListToArray {

    public static String[] convertArrayListToArray(ArrayList<String> stringList) {

        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);
        return stringArray;
    }

    public static void printArray(String[] array) {

        System.out.println("Array after conversion:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}


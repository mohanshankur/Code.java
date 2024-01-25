package Arraylist;

import java.util.ArrayList;


public class RemoveLastElement {

    public static void removing(ArrayList<String> list){

        if (!list.isEmpty()) {
            list.remove(list.size()-1);
        }
    }


}
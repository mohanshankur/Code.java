package Arraylist;

import Arraylist.RemoveLastElement;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RemoveLastElementTest {



    @Test
    public void testRemoveLastElement() {
        // Creating an ArrayList of Strings
        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Chevy");
        car.add("Benz");
        car.add("Opel");

        // Removing the last element
        RemoveLastElement.removing(car);

        // Expected ArrayList after removal
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Toyota");
        expectedList.add("Chevy");
        expectedList.add("Benz");

        // Check if the ArrayList matches the expected list
        Assert.assertEquals(expectedList, car);
    }

    @Test
    public void testRemoveLastElementFromEmptyList() {

        ArrayList<String> emptyList = new ArrayList<>();


        RemoveLastElement.removing(emptyList);


        ArrayList<String> expectedEmptyList = new ArrayList<>();

        Assert.assertEquals(expectedEmptyList, emptyList);
    }
}

package Arraylist;

import Arraylist.TraverseList;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TraverseListTest {
    TraverseList t=new TraverseList();

    @Test
    public void testTraverseListRegularForLoop() {
        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Camry");
        car.add("Bmw");
        car.add("Ford");

        List<String> result = t.traverseListRegularForLoop(car);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Toyota");
        expectedList.add("Camry");
        expectedList.add("Bmw");
        expectedList.add("Ford");

        assertEquals(expectedList, result);
    }

    @Test
    public void testTraverseListEnhancedForLoop() {
        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Camry");
        car.add("Bmw");
        car.add("Ford");

        List<String> result = t.traverseListEnhancedForLoop(car);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Toyota");
        expectedList.add("Camry");
        expectedList.add("Bmw");
        expectedList.add("Ford");

        assertEquals(expectedList, result);
    }
}
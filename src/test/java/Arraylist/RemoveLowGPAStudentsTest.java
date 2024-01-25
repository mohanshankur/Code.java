
package Arraylist;

import Arraylist.RemoveLowGPAStudents;
import Arraylist.Student;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveLowGPAStudentsTest {

    @Test
    public void testRemoveLowGPAStudents() {
        // Creating an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Teja", "sai", 3.5));
        studentList.add(new Student("Sai", "kumar", 3.2));
        studentList.add(new Student("Venkat", "bonala", 3.8));
        studentList.add(new Student("Siva", "sai", 4.0));


        ArrayList<Student> result = RemoveLowGPAStudents.removeLowGPAStudents(studentList);


        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student("Venkat", "bonala", 3.8));
        expectedList.add(new Student("Siva", "sai", 4.0));


        expectedList.equals(result);
    }

    @Test
    public void testRemoveLowGPAStudentsWithEmptyList() {

        ArrayList<Student> emptyList = new ArrayList<>();


        ArrayList<Student> result = RemoveLowGPAStudents.removeLowGPAStudents(emptyList);


        List<Student> expectedEmptyList = new ArrayList<>();


        Assert.assertEquals(expectedEmptyList, result);
    }
}
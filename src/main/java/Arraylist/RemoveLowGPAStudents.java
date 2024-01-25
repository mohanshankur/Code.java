package Arraylist;


import java.util.ArrayList;

public class RemoveLowGPAStudents {

    public static ArrayList<Student> removeLowGPAStudents(ArrayList<Student> studentList) {
        double totalGPA = 0;

        // Calculate the total GPA
        for (Student student : studentList) {
            totalGPA += student.GPA;
        }

        // Calculate the average GPA
        double averageGPA = studentList.isEmpty() ? 0 : totalGPA / studentList.size();

        // Remove students with GPA less than the average
        studentList.removeIf(student -> student.GPA < averageGPA);

        // Return the modified list
        return studentList;
    }
}
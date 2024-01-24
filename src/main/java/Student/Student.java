package mohan;

public class Student {
        public static String name;

        public String getName() {
            return name;
        }

        public static void main(String args[]) {

            Student student = new Student();

            Student.name = "mohan";



            System.out.println("Mohan.Student Name: " + student.getName());
        }
    }


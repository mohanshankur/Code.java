package collections;

public class student {
    String firstName;
    String lastName;
    double GPA;

    public student(String firstName, String lastName, double GPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public double getGPA() {
        return GPA;
    }
}
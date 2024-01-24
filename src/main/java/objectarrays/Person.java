package objectarrays;

public class Person {

        private double height;
        private double weight;
        private String ssn;
        private String phoneNumber;

        // Constructor
        public Person(double height, double weight, String ssn, String phoneNumber) {
            this.height = height;
            this.weight = weight;
            this.ssn = ssn;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters (you can generate these automatically in many IDEs)

        // Override equals method to match based on ssn
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Person person = (Person) obj;
            return ssn.equals(person.ssn);
        }

        // You may also want to override hashCode when overriding equals
        @Override
        public int hashCode() {
            return ssn.hashCode();
        }

        public static void main(String[] args) {
            Person person1 = new Person(175.0, 70.0, "123-45-6789", "123-456-7890");
            Person person2 = new Person(180.0, 75.0, "987-65-4321", "987-654-3210");
            Person person3 = new Person(165.0, 60.0, "123-45-6789", "555-555-5555");

            // Testing the equals method
            System.out.println("Objectarrays.Person 1 equals Objectarrays.Person 2: " + person1.equals(person2)); // false
            System.out.println("Objectarrays.Person 1 equals Objectarrays.Person 3: " + person1.equals(person3)); // true
        }
    }



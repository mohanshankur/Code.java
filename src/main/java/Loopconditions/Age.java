package Loopconditions;

public class Age {
           static String getAge(int age){
            if(age > 13 && age < 19)
                return "Teen";
            else if( age < 13)
                return "Kid";
            else
                return "Adult";


        }

        public static void main(String[] args) {
            System.out.println(getAge(12));
        }
    }


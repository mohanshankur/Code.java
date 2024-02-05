package additional;

public class ArraySum {

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            int sum = calculateSum(array);

            System.out.println("Sum of all items in the array: " + sum);
        }

        public static int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }
    }



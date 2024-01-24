package Loopconditions;

public class FibonacciSeries {

        static void printFibonacciSeries(int N) {
            int firstData = 0, secondData = 1;

            System.out.print("Fibonacci Series up to " + N + " terms: ");

            for (int i = 0; i < N; i++) {
                System.out.print(firstData + " ");

                int lastData = firstData + secondData;
                firstData = secondData;
                secondData = lastData;
            }
        }


        public static void main(String[] args) {
            printFibonacciSeries(10);
        }

}

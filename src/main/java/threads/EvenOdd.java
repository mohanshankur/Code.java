package threads;

public class EvenOdd {


        public static void main(String[] args) {
            Thread evenThread = new Thread(() -> printNumbers("Even", 2, 60));
            Thread oddThread = new Thread(() -> printNumbers("Odd", 1, 59));

            evenThread.start();
            oddThread.start();
        }

        private static void printNumbers(String type, int start, int end) {
            for (int i = start; i <= end; i += 2) {
                System.out.println(type + ": " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



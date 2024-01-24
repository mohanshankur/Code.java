public class Pattern {

        public static void main(String[] args) {
            int x = 5;
            for (int i = 0; i < x ; i++){
                for (int j = x - i -2; j >= 0; j--){
                    System.out.print("+");
                }
                for (int j = x -2 -i; j < x; j++){
                    System.out.print("-");
                }
                System.out.println(" ");
            }
        }
    }


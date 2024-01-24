package objectarrays;

public class Product implements Comparable<Product> {
        private double weight;
        private double price;
        private int id;

        // Constructor
        public Product(double weight, double price, int id) {
            this.weight = weight;
            this.price = price;
            this.id = id;
        }

        // Getters and Setters (you can generate these automatically in many IDEs)

        // Implement compareTo method from Comparable interface
        @Override
        public int compareTo(Product otherProduct) {
            // Compare products based on their price
            return Double.compare(this.price, otherProduct.price);
        }

        public static void main(String[] args) {
            // Testing the Objectarrays.Product class and Comparable interface
            Product product1 = new Product(1.5, 20.0, 101);
            Product product2 = new Product(2.0, 15.0, 102);
            Product product3 = new Product(1.8, 25.0, 103);

            // Comparing products based on price
            int result1to2 = product1.compareTo(product2);
            int result2to3 = product2.compareTo(product3);

            System.out.println("Objectarrays.Product 1 compared to Objectarrays.Product 2: " + result1to2);
            System.out.println("Objectarrays.Product 2 compared to Objectarrays.Product 3: " + result2to3);
        }
    }



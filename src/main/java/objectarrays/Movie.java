package objectarrays;

import java.util.Comparator;

    public class Movie {
        private int yearReleased;
        private double rating;
        private double budget;
        private double collectionAmount;

        // Constructor
        public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
            this.yearReleased = yearReleased;
            this.rating = rating;
            this.budget = budget;
            this.collectionAmount = collectionAmount;
        }

        // Getters and Setters

        public int getYearReleased() {
            return yearReleased;
        }

        public double getRating() {
            return rating;
        }

        public double getBudget() {
            return budget;
        }

        public double getCollectionAmount() {
            return collectionAmount;
        }

        // First Comparator implementation: Sort by rating and profit
        public static Comparator<Movie> ratingAndProfitComparator = Comparator
                .comparing(Movie::getRating)
                .thenComparing(Movie::getProfit, Comparator.reverseOrder());

        // Second Comparator implementation: Sort by year released and rating
        public static Comparator<Movie> yearReleasedAndRatingComparator = Comparator
                .comparing(Movie::getYearReleased)
                .thenComparing(Movie::getRating, Comparator.reverseOrder());

        // Additional method to calculate profit
        public double getProfit() {
            return collectionAmount - budget;
        }

        public static void main(String[] args) {
            // Testing the Objectarrays.Movie class and Comparator implementations
            Movie movie1 = new Movie(2000, 8.5, 50.0, 200.0);
            Movie movie2 = new Movie(2010, 7.8, 80.0, 150.0);
            Movie movie3 = new Movie(2005, 9.0, 30.0, 300.0);

            // Sorting movies using the first Comparator (rating and profit)
            System.out.println("Sorting by Rating and Profit:");
            System.out.println("Before sorting: " + movie1.getRating() + ", " + movie1.getProfit());
            System.out.println("Before sorting: " + movie2.getRating() + ", " + movie2.getProfit());
            System.out.println("Before sorting: " + movie3.getRating() + ", " + movie3.getProfit());

            Movie[] moviesByRatingAndProfit = { movie1, movie2, movie3 };
            java.util.Arrays.sort(moviesByRatingAndProfit, Movie.ratingAndProfitComparator);

            for (Movie movie : moviesByRatingAndProfit) {
                System.out.println("After sorting: " + movie.getRating() + ", " + movie.getProfit());
            }

            // Sorting movies using the second Comparator (year released and rating)
            System.out.println("\nSorting by Year Released and Rating:");
            System.out.println("Before sorting: " + movie1.getYearReleased() + ", " + movie1.getRating());
            System.out.println("Before sorting: " + movie2.getYearReleased() + ", " + movie2.getRating());
            System.out.println("Before sorting: " + movie3.getYearReleased() + ", " + movie3.getRating());

            Movie[] moviesByYearAndRating = { movie1, movie2, movie3 };
            java.util.Arrays.sort(moviesByYearAndRating, Movie.yearReleasedAndRatingComparator);

            for (Movie movie : moviesByYearAndRating) {
                System.out.println("After sorting: " + movie.getYearReleased() + ", " + movie.getRating());
            }

    }

}

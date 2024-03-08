package src.main.java.io.codelex.classesandobjects.practice;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royal", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista Internationa", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        System.out.println("Movie 1:");
        displayMovieDetails(movie1);
        System.out.println();

        System.out.println("Movie 2:");
        displayMovieDetails(movie2);
        System.out.println();

        System.out.println("Movie 3:");
        displayMovieDetails(movie3);
        System.out.println();

        System.out.println("PG Movies:");
        Movie[] movies = {movie1, movie2, movie3};
        Movie[] pgMovies = Movie.getPG(movies);
        for (Movie movie : pgMovies) {
            displayMovieDetails(movie);
            System.out.println();
        }
    }

    public static void displayMovieDetails(Movie movie) {
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Studio: " + movie.getStudio());
        System.out.println("Rating: " + movie.getRating());
    }


}

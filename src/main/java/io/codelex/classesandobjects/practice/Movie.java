package src.main.java.io.codelex.classesandobjects.practice;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;


    public Movie(String title, String studio, String rating) {

        this.title = title;
        this.studio = studio;
        this.rating = rating;

    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }


    public static Movie[] getPG(Movie[] movies) {
        List<Movie> pgMoviesList = new ArrayList<>();
        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                pgMoviesList.add(movie);
            }
        }
        return pgMoviesList.toArray(new Movie[0]);
    }
}



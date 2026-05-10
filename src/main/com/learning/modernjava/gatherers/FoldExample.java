package main.com.learning.modernjava.gatherers;

import main.com.learning.modernjava.MovieDataGenerator;
import main.com.learning.modernjava.model.Movie;

import java.util.List;
import java.util.stream.Gatherers;

public class FoldExample {

    public static void main(String[] args) {

        List<Movie> movieList = MovieDataGenerator.fillAllMovieDetails();

        Double totalRating = movieList.stream()
                .gather(Gatherers.fold(
                        () -> 0.0,
                        (acc, res) -> acc + res.rating()
                )).findFirst()
                .orElse(0.0);

        String titleConcatenation = movieList.stream()
                .gather(Gatherers.fold(
                        () -> "",
                        (ini, movie) -> ini == "" ? movie.title() : ini.concat(", ").concat(movie.title())
                ))
                .findFirst()
                .orElse("");

        System.out.println(titleConcatenation);
        System.out.println(totalRating);
    }
}

package main.com.learning.modernjava.gatherers;

import main.com.learning.modernjava.MovieDataGenerator;
import main.com.learning.modernjava.model.Movie;

import java.util.List;
import java.util.stream.Gatherers;

public class ScanExample {

    public static void main(String[] args) {

        List<Movie> movieList = MovieDataGenerator.fillAllMovieDetails();

        movieList.stream()
                .gather(Gatherers.scan(
                        () -> 0.0f,
                        (acc, movie) -> acc + movie.rating()
                )).forEach(System.out::println);
    }
}

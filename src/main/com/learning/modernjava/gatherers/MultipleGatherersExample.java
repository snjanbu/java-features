package main.com.learning.modernjava.gatherers;

import main.com.learning.modernjava.MovieDataGenerator;
import main.com.learning.modernjava.model.Movie;

import java.util.List;
import java.util.stream.Gatherers;

public class MultipleGatherersExample {

    public static void main(String[] args) {

        List<Movie> movieList = MovieDataGenerator.fillAllMovieDetails();

        movieList.stream()
                .filter(movie -> movie.rating() > 8.0)
                .gather(Gatherers.windowFixed(2))
                .gather(Gatherers.scan(
                        () -> 0.0,
                        (acc, movies) -> {
                            double total = movies.stream()
                                    .mapToDouble(Movie::rating)
                                    .reduce(0.0f, Double::sum);
                            return total / movies.size();
                        }
                )).forEach(average -> {
                    System.out.println("Average " + average);
                });
    }
}

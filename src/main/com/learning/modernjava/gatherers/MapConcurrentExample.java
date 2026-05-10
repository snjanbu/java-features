package main.com.learning.modernjava.gatherers;

import main.com.learning.modernjava.MovieDataGenerator;
import main.com.learning.modernjava.model.Movie;

import java.util.List;
import java.util.stream.Gatherers;

public class MapConcurrentExample {

    public static void main(String[] args) {

        List<Movie> movieList = MovieDataGenerator.fillAllMovieDetails();

        long startTime = System.currentTimeMillis();
        movieList.stream()
                .gather(Gatherers.mapConcurrent(1, movie -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Exception occured" + ex.getMessage());
                    }
                    return movie.title();
                })).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

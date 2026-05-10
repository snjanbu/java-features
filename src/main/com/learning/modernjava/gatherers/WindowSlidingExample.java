package main.com.learning.modernjava.gatherers;

import main.com.learning.modernjava.MovieDataGenerator;
import main.com.learning.modernjava.model.Movie;

import java.util.List;
import java.util.stream.Gatherers;

public class WindowSlidingExample {

    public static void main(String[] args) {

        List<Movie> movieList = MovieDataGenerator.fillAllMovieDetails();

        movieList.stream()
                .limit(5)
                .gather(Gatherers.windowSliding(3))
                .forEach(window -> {
                    System.out.println("__moview__");
                    window.forEach(System.out::println);
                });
    }
}

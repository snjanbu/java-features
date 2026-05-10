package main.com.learning.modernjava.gatherers;

import main.com.learning.modernjava.MovieDataGenerator;
import main.com.learning.modernjava.model.Movie;

import java.util.List;
import java.util.stream.Gatherers;

public class WindowFixedExample {

    public static void main(String[] args) {

        List<Movie> movieList = MovieDataGenerator.fillAllMovieDetails();

        movieList.stream()
                .gather(Gatherers.windowFixed(3))
                .forEach(window -> {
                    System.out.println("WINDOW Of size 3");
                    window.forEach(System.out::println);
                    System.out.println();
                });
    }
}

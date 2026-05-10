package main.com.learning.modernjava;

import main.com.learning.modernjava.model.Movie;
import main.com.learning.modernjava.enums.MovieGenre;

import java.util.List;

public class MovieDataGenerator {

    public static List<Movie> fillAllMovieDetails() {
        return List.of(
                new Movie("The Shawshank Redemption", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", 9.3f, MovieGenre.ACTION),
                new Movie("The Godfather", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", 9.2f, MovieGenre.ACTION),
                new Movie("The Dark Knight", "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests.", 9.0f, MovieGenre.ACTION),
                new Movie("Pulp Fiction", "The lives of two mob hitmen, a boxer, a gangster and his wife intertwine in four tales of violence and redemption.", 8.9f, MovieGenre.ACTION),
                new Movie("Inception", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.", 8.8f, MovieGenre.SCIENCE_FICTION),
                new Movie("The Matrix", "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.", 8.7f, MovieGenre.SCIENCE_FICTION),
                new Movie("Interstellar", "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.", 8.6f, MovieGenre.SCIENCE_FICTION),
                new Movie("The Hangover", "Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor missing.", 7.7f, MovieGenre.COMEDY),
                new Movie("Superbad", "Two co-dependent high school seniors are forced to deal with separation anxiety after their plan to stage a booze-soaked party goes awry.", 7.6f, MovieGenre.COMEDY),
                new Movie("Groundhog Day", "A weatherman finds himself inexplicably living the same day over and over again.", 8.0f, MovieGenre.COMEDY)
        );
    }
}

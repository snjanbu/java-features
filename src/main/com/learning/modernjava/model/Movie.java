package main.com.learning.modernjava.model;

import main.com.learning.modernjava.enums.MovieGenre;

public record Movie(String title, String description, float rating, MovieGenre genre) {
}

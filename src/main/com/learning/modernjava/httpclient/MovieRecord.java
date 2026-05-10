package main.com.learning.modernjava.httpclient;

import java.time.LocalDate;

public record MovieRecord(Double movie_id, String name, String cast, Integer year, LocalDate releaseDate) {
}

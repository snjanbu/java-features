package main.com.learning.modernjava.httpclient;

import tools.jackson.core.JsonParser;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    private static String GET_ALL_MOVIES_URL = "http://127.0.0.1:8000/src/resources/movies.json";

    private static String GET_BY_ID_URL = "http://127.0.0.1:8000/src/resources/movie_by_id.json";

    private static ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = getClient();
        HttpRequest request = getRequest(GET_BY_ID_URL);
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(objectMapper.readValue(response.body(), MovieRecord.class));

        var asyncResponse = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        var movie = asyncResponse.thenApply(stringHttpResponse -> {
            return objectMapper.readValue(stringHttpResponse.body(), MovieRecord.class);
        });
        System.out.println(movie.join());

    }

    private static HttpClient getClient() {
        return HttpClient.newBuilder()
                .build();
    }

    private static HttpRequest getRequest(String url) {
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
    }
}

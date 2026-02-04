package com.example.movie_api.service;
import com.example.movie_api.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();
    private long idCounter = 1;

    public Movie addMovie(Movie movie) {
        movie.setId(idCounter++);
        movies.add(movie);
        return movie;
    }

    public Optional<Movie> getMovieById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}
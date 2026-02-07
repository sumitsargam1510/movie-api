package com.example.movie_api.controller;

import com.example.movie_api.model.Movie;
import com.example.movie_api.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    //testing api
    @GetMapping("/test")
    public String test() {
        return "API is working";
    }


    // Add movie
    @PostMapping
    public ResponseEntity<?> addMovie(@Valid @RequestBody Movie movie) {
        try {
            return ResponseEntity.ok(movieService.addMovie(movie));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }


    // Get movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {
        return movieService.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

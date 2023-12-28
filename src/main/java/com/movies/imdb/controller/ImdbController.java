package com.movies.imdb.controller;

import com.movies.imdb.XmlFile.Cinema;
import com.movies.imdb.model.Movies;
import com.movies.imdb.service.ImdbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imdb")
@RequiredArgsConstructor
public class ImdbController {

    private final ImdbService imdbService;

    @PostMapping(value = "/get-movies", produces = {"application/json"})
    public ResponseEntity<String> getMovies(@RequestBody Movies movies){

        String response = imdbService.getMoviesData(movies);
        return new ResponseEntity<String>(response, HttpStatus.CREATED);
    }

    @PostMapping(value = "/get-file", produces = {"application/xml"})
    //@PostMapping(value = "/get-file",consumes = {"application/xml "},produces = {"application/json "})
    public Cinema getCinema(@RequestBody Cinema cinema){
        System.out.println(cinema.getMovies());
        return cinema;
    }
}

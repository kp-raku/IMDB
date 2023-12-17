package com.movies.imdb.service;

import com.movies.imdb.model.Movies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;

@Service
@Slf4j
public class ImdbService {

    private static final String url = "https://imdb188.p.rapidapi.com/api/v1/getPopularMovies";
    private static final String xRapidApiKey = "018091f65dmsh7829daea25712e7p16665bjsn77e0fb1ac5af";
    private static final String xRapidApiHost = "imdb188.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

    public String getMoviesData(Movies movies) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", xRapidApiKey);
            headers.set("X-RapidAPI-Host", xRapidApiHost);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            HttpEntity<Movies> httpEntity = new HttpEntity<>(movies, headers);

            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
            if(response!= null)
                System.out.println("Call is success");
            log.info("Output from Rapid API:", response.getBody());
            return response.getBody();


        } catch (Exception e) {
            log.error("Something went wrong while getting value from RapidApi", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception while calling endpoint of RapidApi for corona",
                    e
            );
        }
    }
}

package com.movies.imdb.service;

import com.movies.imdb.XmlFile.Cinema;
import com.movies.imdb.model.Movies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;

@Service
@Slf4j
public class ImdbService {


    @Value("${imdb.url}")
    private String url;

    @Value("${imdb.xRapidApiKey}")
    private String xRapidApiKey;

    @Value("${imdb.xRapidApiHost}")
    private String xRapidApiHost;

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
            if (response != null)
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

    public Cinema getOutputFile(Cinema cinema) {

        Cinema opFile = new Cinema();
        try {
            System.out.println("inside opfile");
            //System.out.println("Hero: " + cinema.getMovie().getHero());
            //opFile.getMovie().setHero("Mohanlal");
            //System.out.println("Hero hardcoded: " + opFile.getMovie().getHero());
//            opFile.getMovie().setHero(cinema.getMovie().getHero());
//            opFile.getMovie().setName(cinema.getMovie().getName());
//            opFile.getMovie().setBudget(cinema.getMovie().getBudget());
            //System.out.println("Name from opfile: " + opFile.getMovie().getName());

        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
        return opFile;

    }
}

package com.movies.imdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movies {

    private Country country;
    private int limit;
    private ReleaseDate releaseDate;
    private UserRatings userRatings;
    private Genre genre;
    private Runtimes runtime;
}

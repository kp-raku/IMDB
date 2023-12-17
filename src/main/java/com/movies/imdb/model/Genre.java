package com.movies.imdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Genre {

    private List<String> allGenreIds;
}

package com.movies.imdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Country {

    private List<String> anyPrimaryCountries;
}

package com.movies.imdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AggregateRatingRange {

    private int max;
    private int min;
}

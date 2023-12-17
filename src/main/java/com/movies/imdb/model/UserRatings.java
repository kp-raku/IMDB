package com.movies.imdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRatings {

    private AggregateRatingRange aggregateRatingRange;
    private RatingsCountRange ratingsCountRange;
}

package com.movies.imdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class ReleaseDateRange {

    private String end;
    private String start;

}

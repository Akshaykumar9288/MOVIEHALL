package com.MOVIEHALL.controller;


import com.MOVIEHALL.Model.Movie;
import com.MOVIEHALL.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Movie")
public class MovieController {

    @Autowired
    private MovieService service;

    public Movie save(@RequestBody Movie movie){
        return service.save(movie);
    }

    public List<Movie> getAllMovie(){
        return service.findAllMovie();
    }

    public List<Movie> getMovieByName(@RequestParam("title") String title){
        return service.findMovieByName(title);
    }

    public Optional<Movie> findById(@RequestParam("id") Long id){
        return service.findMovieById(id);
    }

    public List<Movie> getByGenre(@RequestParam("genre")String genre){
        return service.findByGenre(genre);
    }

    public List<Movie> getMovieByCountry(@RequestParam("country") String country){
        return service.findByCountry(country);
    }

    public List<Movie> getMovieByMovieDate(@RequestParam("movie_date")LocalDate MovieDate){
        return service.findByDate(MovieDate);
    }
}

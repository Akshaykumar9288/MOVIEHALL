package com.MOVIEHALL.controller;


import com.MOVIEHALL.Model.Cinema;
import com.MOVIEHALL.Model.Movie;
import com.MOVIEHALL.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/Movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping("addMovie")
    public Movie save(@RequestBody Movie movie){
        return service.save(movie);
    }

    @GetMapping("getAllMovie")
    public List<Movie> getAllMovie(){
        return service.findAllMovie();
    }

    @GetMapping("getByName")
    public Movie getMovieByName(@RequestParam ("title") String title){
        return service.findMovieByName(title);
    }
//
//    public Movie findById(@RequestParam("id") Long id){
//        return service.findMovieById(id);
//    }
//
//    public List<Movie> getByGenre(@RequestParam("genre")String genre){
//        return service.findByGenre(genre);
//    }
//
//    public List<Movie> getMovieByCountry(@RequestParam("country") String country){
//        return service.findByCountry(country);
//    }
//
//    public List<Movie> getMovieByMovieDate(@RequestParam("movie_date")LocalDate MovieDate){
//        return service.findByDate(MovieDate);
//    }
//
//    public Movie updateMovie(@RequestParam("id")Long id, @RequestBody Movie movie){
//        return service.updateMovie(id,movie);
//    }
//
//    public void deleteMovie(@RequestParam("id")Long id){
//        service.deleteMovie(id);
//    }
}

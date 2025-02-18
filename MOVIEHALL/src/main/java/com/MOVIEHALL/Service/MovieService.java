package com.MOVIEHALL.Service;


import com.MOVIEHALL.Model.Movie;
import com.MOVIEHALL.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public Movie save(Movie movie){
        return movieRepo.save(movie);
    }

    public List<Movie> findAllMovie(){
        return movieRepo.findAll();
    }

    public Movie findMovieByName(String title){
        return movieRepo.findByTitle(title);
    }
//
//    public Movie findMovieById(Long id){
//        return movieRepo.findById(id).orElse(null);
//    }
//
//    public List<Movie> findByGenre(String genre){
//        return movieRepo.findByGenre(genre);
//    }
//
//    public List<Movie> findByCountry(String country){
//        return movieRepo.findByCountry(country);
//    }
//   // public List<Movie> findByDate(LocalDate MovieDate){return movieRepo.findByMovieDate(MovieDate);}
//
//    public Movie updateMovie(Long id,Movie movie){
//        if (movieRepo.existsById(id)){
//            movie.setId(id);
//            return movieRepo.save(movie);
//        }
//        return null;
//    }
//
//    public void deleteMovie(Long id){
//        movieRepo.deleteById(id);
//    }
}

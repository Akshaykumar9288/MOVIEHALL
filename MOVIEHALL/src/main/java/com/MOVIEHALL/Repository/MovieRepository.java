package com.MOVIEHALL.Repository;

import com.MOVIEHALL.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    //@Query("SELECT u FROM Movie u WHERE u.title = :title")
    Movie findByTitle(String title);

//    @Query("SELECT u FROM Movie u WHERE u.genre = :genre")
//    List<Movie> findByGenre(@RequestParam("genre") String genre);
//
//    @Query("SELECT u FROM Movie u WHERE u.country = :country")
//    List<Movie> findByCountry(@RequestParam("country") String country);
//
//   // @Query("SELECT u FROM Movie u WHERE u.movieDate = :movieDate")
//   // List<Movie> findByMovieDate(@RequestParam("movieDate")LocalDate movieDate);
//    List<Movie> findByMovieDate(LocalDate movieDate);
}

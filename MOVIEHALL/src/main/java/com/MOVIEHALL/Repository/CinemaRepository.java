package com.MOVIEHALL.Repository;

import com.MOVIEHALL.Model.Cinema;
import com.MOVIEHALL.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {

    @Query("SELECT u FROM Cinema u WHERE u.CinemaName = :CinemaName")
    List<Cinema> findByCinemaName(@RequestParam("CinemaName") String CinemaName);

    @Query("SELECT u FROM Cinema u WHERE u.location = :location")
    List<Cinema> findByLocation(@RequestParam("location") String location);

}

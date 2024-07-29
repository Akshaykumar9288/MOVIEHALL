package com.MOVIEHALL.Service;

import com.MOVIEHALL.Model.Cinema;
import com.MOVIEHALL.Repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public Optional<Cinema> findCinemaById(Long id){
        return cinemaRepository.findById(id);
    }

    public List<Cinema> findByCinemaName(String CinemaName){
        return cinemaRepository.findByCinemaName(CinemaName);
    }


}

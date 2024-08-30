package com.MOVIEHALL.Service;


import com.MOVIEHALL.Model.CinemaHall;
import com.MOVIEHALL.Repository.CinemaHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CinemaHallService {

    @Autowired
    private CinemaHallRepository repository;

    public Optional<CinemaHall> getById(Long id){
        return repository.findById(id);
    }


}

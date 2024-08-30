package com.MOVIEHALL.Service;

import com.MOVIEHALL.Model.Cinema;
import com.MOVIEHALL.Repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public Cinema findCinemaById(Long id){
        return cinemaRepository.findById(id).orElse(null);
    }

    public List<Cinema> findByCinemaName(String CinemaName){
        return cinemaRepository.findByCinemaName(CinemaName);
    }

    public long TotalCinemaHall(){
        return cinemaRepository.count();
    }

    public List<Cinema> findByLocation(String location){
        return cinemaRepository.findByLocation(location);
    }

    public List<Cinema> findAllCinemas() {
        return cinemaRepository.findAll();
    }

    public Cinema createCinema(Cinema cinema){
        return cinemaRepository.save(cinema);
    }

    public Cinema updateCinema(Long id,Cinema cinema){
        if (cinemaRepository.existsById(id)){
            cinema.setId(id);
            return cinemaRepository.save(cinema);
        }
        return null;
    }

    public void deleteCinema(Long id){
        cinemaRepository.deleteById(id);
    }
}

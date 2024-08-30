package com.MOVIEHALL.controller;

import com.MOVIEHALL.Model.Cinema;
import com.MOVIEHALL.Service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Cinema")
public class CinemaController {
    @Autowired
    private CinemaService service;

    public Cinema getCinemaById(@RequestParam("id") Long id){
        return service.findCinemaById(id);
    }

    public List<Cinema> getByCinemaName(@RequestParam("CinemaName") String CinemaName){
        return service.findByCinemaName(CinemaName);
    }

    public long getTotalCinemaHall(){
        return service.TotalCinemaHall();
    }

    public List<Cinema> getByLocation(@RequestParam("location") String location){
        return service.findByLocation(location);
    }

    public List<Cinema> getAllCinema(){
        return service.findAllCinemas();
    }

    public Cinema save(@RequestBody Cinema cinema){
        return service.createCinema(cinema);
    }

    public Cinema updateCinema(@RequestParam("id") Long id, @RequestBody Cinema cinema){
        return service.updateCinema(id,cinema);
    }

    public void deleteCinema(@RequestParam("id")Long id){
        service.deleteCinema(id);
    }
}

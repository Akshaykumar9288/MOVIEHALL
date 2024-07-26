package com.MOVIEHALL.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String CinemaHallName;
    private int TotalSeats;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCinemaHallName() {
        return CinemaHallName;
    }

    public void setCinemaHallName(String cinemaHallName) {
        CinemaHallName = cinemaHallName;
    }

    public int getTotalSeats() {
        return TotalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        TotalSeats = totalSeats;
    }

    public CinemaHall(Long id, String cinemaHallName, int totalSeats) {
        Id = id;
        CinemaHallName = cinemaHallName;
        TotalSeats = totalSeats;
    }

    public CinemaHall(){}

    @Override
    public String toString() {
        return "CinemaHall{" +
                "Id=" + Id +
                ", CinemaHallName='" + CinemaHallName + '\'' +
                ", TotalSeats=" + TotalSeats +
                '}';
    }
}

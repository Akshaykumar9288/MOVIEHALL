package com.MOVIEHALL.Model;

import jakarta.persistence.*;

@Entity
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema CinemaHallName;
    private int TotalSeats;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Cinema getCinemaHallName() {
        return CinemaHallName;
    }

    public void setCinemaHallName(Cinema cinemaHallName) {
        CinemaHallName = cinemaHallName;
    }

    public int getTotalSeats() {
        return TotalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        TotalSeats = totalSeats;
    }

    public CinemaHall(Long id, Cinema cinemaHallName, int totalSeats) {
        Id = id;
        CinemaHallName = cinemaHallName;
        TotalSeats = totalSeats;
    }

    public CinemaHall(){}

    @Override
    public String toString() {
        return "CinemaHall{" +
                "Id=" + Id +
                ", CinemaHallName=" + CinemaHallName +
                ", TotalSeats=" + TotalSeats +
                '}';
    }
}

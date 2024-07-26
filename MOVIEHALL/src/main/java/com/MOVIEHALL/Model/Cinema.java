package com.MOVIEHALL.Model;

import jakarta.persistence.*;

import javax.xml.stream.Location;

@Entity
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CinemaName;
    private int TotalCinemaHall;
    private String location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCinemaName() {
        return CinemaName;
    }

    public void setCinemaName(String cinemaName) {
        CinemaName = cinemaName;
    }

    public int getTotalCinemaHall() {
        return TotalCinemaHall;
    }

    public void setTotalCinemaHall(int totalCinemaHall) {
        TotalCinemaHall = totalCinemaHall;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Cinema(Long id, String cinemaName, int totalCinemaHall, String location) {
        this.id = id;
        CinemaName = cinemaName;
        TotalCinemaHall = totalCinemaHall;
        this.location = location;
    }

    public Cinema(){}

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", CinemaName='" + CinemaName + '\'' +
                ", TotalCinemaHall=" + TotalCinemaHall +
                ", location='" + location + '\'' +
                '}';
    }
}

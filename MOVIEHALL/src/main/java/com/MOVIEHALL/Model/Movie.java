package com.MOVIEHALL.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @Column(name = "duration_hours")
    private int durationHours;
    @Column(name = "duration_minutes")
    private int durationMinutes;
    @Column(name = "movie_date")
    private LocalDate MovieDate;
    private String country;
    private String genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public LocalDate getMovieDate() {
        return MovieDate;
    }

    public void setMovieDate(LocalDate movieDate) {
        MovieDate = movieDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie(Long id, String title, String description, int durationHours, int durationMinutes, LocalDate movieDate, String country, String genre) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.durationHours = durationHours;
        this.durationMinutes = durationMinutes;
        MovieDate = movieDate;
        this.country = country;
        this.genre = genre;
    }

    public Movie(){}

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", durationHours=" + durationHours +
                ", durationMinutes=" + durationMinutes +
                ", MovieDate=" + MovieDate +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

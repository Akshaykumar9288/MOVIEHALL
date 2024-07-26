package com.MOVIEHALL.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private int duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public Movie(Long id, String title, String description, int duration, LocalDate movieDate, String country, String genre) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
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
                ", duration=" + duration +
                ", MovieDate=" + MovieDate +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

package com.MOVIEHALL.Model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "show_table")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate ShowDate;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    @ManyToOne
    @JoinColumn(name = "cinema_hall_id")
    private CinemaHall cinemaHall;
    private LocalTime ShowStartTime;
    private LocalTime ShowEntTime;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getShowDate() {
        return ShowDate;
    }

    public void setShowDate(LocalDate showDate) {
        ShowDate = showDate;
    }

    public LocalTime getShowStartTime() {
        return ShowStartTime;
    }

    public void setShowStartTime(LocalTime showStartTime) {
        ShowStartTime = showStartTime;
    }

    public LocalTime getShowEntTime() {
        return ShowEntTime;
    }

    public void setShowEntTime(LocalTime showEntTime) {
        ShowEntTime = showEntTime;
    }

    public Show(Long id, LocalDate showDate, Movie movie, CinemaHall cinemaHall, LocalTime showStartTime, LocalTime showEntTime) {
        this.id = id;
        ShowDate = showDate;
        this.movie = movie;
        this.cinemaHall = cinemaHall;
        ShowStartTime = showStartTime;
        ShowEntTime = showEntTime;
    }

    public Show(){}

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", ShowDate=" + ShowDate +
                ", movie=" + movie +
                ", cinemaHall=" + cinemaHall +
                ", ShowStartTime=" + ShowStartTime +
                ", ShowEntTime=" + ShowEntTime +
                '}';
    }
}

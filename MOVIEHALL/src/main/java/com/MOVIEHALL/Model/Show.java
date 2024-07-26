package com.MOVIEHALL.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate ShowDate;
    private LocalTime ShowStartTime;
    private LocalTime ShowEntTime;

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

    public Show(Long id, LocalDate showDate, LocalTime showStartTime, LocalTime showEntTime) {
        this.id = id;
        ShowDate = showDate;
        ShowStartTime = showStartTime;
        ShowEntTime = showEntTime;
    }

    public Show(){}

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", ShowDate=" + ShowDate +
                ", ShowStartTime=" + ShowStartTime +
                ", ShowEntTime=" + ShowEntTime +
                '}';
    }
}

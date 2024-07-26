package com.MOVIEHALL.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShowSeats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Double price;
    private int seatNo;
    private int showId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public ShowSeats(Long id, Double price, int seatNo, int showId) {
        Id = id;
        this.price = price;
        this.seatNo = seatNo;
        this.showId = showId;
    }

    public ShowSeats(){}

    @Override
    public String toString() {
        return "ShowSeats{" +
                "Id=" + Id +
                ", price=" + price +
                ", seatNo=" + seatNo +
                ", showId=" + showId +
                '}';
    }
}

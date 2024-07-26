package com.MOVIEHALL.Repository;

import com.MOVIEHALL.Model.ShowSeats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeat extends JpaRepository<ShowSeats,Long> {
}

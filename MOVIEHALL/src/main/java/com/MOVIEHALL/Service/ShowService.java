package com.MOVIEHALL.Service;


import com.MOVIEHALL.Model.Show;
import com.MOVIEHALL.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
    private ShowRepository repository;

    public Show saveShow(Show show){
        return repository.save(show);
    }
}

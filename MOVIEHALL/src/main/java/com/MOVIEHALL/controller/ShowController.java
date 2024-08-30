package com.MOVIEHALL.controller;

import com.MOVIEHALL.Model.Show;
import com.MOVIEHALL.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @Autowired
    private ShowService service;

    @PostMapping("CreateShow")
    public Show createShow(@RequestBody Show show){
        return service.saveShow(show);
    }
}

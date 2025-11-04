package com.genc.gig_marketplace.controller;

import com.genc.gig_marketplace.entity.Gig;
import com.genc.gig_marketplace.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class    GigController {

    @Autowired
    private GigService gigService;

    @GetMapping("/search/{keyword}")
    public List<Gig> searchGigs(@PathVariable String keyword){
        return gigService.searchGigs(keyword);
    }

    @GetMapping
    public List<Gig> getAllGigs(){
        return gigService.searchGigs(null);
    }
}

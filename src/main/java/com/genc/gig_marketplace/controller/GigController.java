package com.genc.gig_marketplace.controller;

import com.genc.gig_marketplace.entity.Gig;
import com.genc.gig_marketplace.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class    GigController {

    @Autowired
    private GigService gigService;

    @GetMapping("/search")
    public Page<Gig> searchGigs(@RequestParam(required = false) String keyword, @RequestParam(defaultValue = "0") int pageNumber){
        Pageable pageable = PageRequest.of(pageNumber,5);
        return gigService.searchGigs(keyword, pageable);
    }
}

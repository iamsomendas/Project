package com.genc.gig_marketplace.service;

import com.genc.gig_marketplace.entity.Gig;
import com.genc.gig_marketplace.repository.GigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigService {

    @Autowired
    private GigRepo gigRepo;

    public Page<Gig> searchGigs(String keyword, Pageable pageable){
        if(keyword==null || keyword.trim().isEmpty()){
            return gigRepo.findAll(pageable);
        }
        System.out.println("Got the result");
        return gigRepo.searchByKeyword(keyword, pageable);
    }
}

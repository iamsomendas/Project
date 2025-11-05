package com.genc.gig_marketplace.repository;

import com.genc.gig_marketplace.entity.Gig;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GigRepo extends JpaRepository<Gig,Long> {

    @Query("SELECT g FROM Gig g WHERE LOWER(g.title) LIKE LOWER(CONCAT('%', :keyword, '%'))" +
    "OR LOWER(g.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    Page<Gig> searchByKeyword(@Param("keyword") String keyword, Pageable pageable);
}

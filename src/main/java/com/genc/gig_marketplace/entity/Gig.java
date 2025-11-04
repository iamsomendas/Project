package com.genc.gig_marketplace.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "gig")
public class Gig {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long gigId;

    private String title;
    private String description;

//    @ManyToOne
//    @JoinColumn(name = "posted_by")
//    private User postedBy;
//
//    @ManyToOne
//    @JoinColumn(name = "department_id")
//    private Department department;
//
//    private LocalDate startDate;
//
//    private LocalDate endDate;
//
//    private Integer durationWeeks;
//
//    @Enumerated(EnumType.STRING)
//    private GigStatus status;
//
//    private LocalDateTime createdAt;
//
//    private LocalDateTime updatedAt;
//
//    public enum GigStatus {OPEN, CLOSED, CANCELLED}
}

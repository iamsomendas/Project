package com.genc.gig_marketplace.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time. LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    private String location;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public enum Role {EMPLOYEE, MANAGER, ADMIN}
}

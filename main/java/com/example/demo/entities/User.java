package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="USERS")
@Table(name="users")
public class User {

    @Id
    @SequenceGenerator(
            name = "USER_SEQ",
            sequenceName = "USER_SEQ",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "USER_SEQ"
    )
    @Column(name="id")
    private Long id;

    @Column(name="date_registration")
    private LocalDate date;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="date_birthday")
    private LocalDate date_b;

    @Column(name="city", nullable=false)
    private String city;
}
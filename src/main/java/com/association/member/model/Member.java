package com.association.member.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Member {

    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate dateOfBirth;

}

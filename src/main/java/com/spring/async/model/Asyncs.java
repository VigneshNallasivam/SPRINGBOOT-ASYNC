package com.spring.async.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asyncs
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNo;
    private String firstName;
    private String lastName;
    private String place;
}

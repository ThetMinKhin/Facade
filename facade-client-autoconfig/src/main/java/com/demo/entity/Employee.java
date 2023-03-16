package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    @Id
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;

    private double salary;

    public Employee(){

    }
}

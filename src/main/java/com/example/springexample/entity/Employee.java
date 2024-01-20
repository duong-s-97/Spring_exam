package com.example.springexample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private Integer salary;

}

package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="users")

public class User {
    @Column(name ="name")
    private String name;

    @Column(name ="staff_id")
    private String id;


}

package com.ganzouri.springbootwsqlite.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

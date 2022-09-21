package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;

@Entity
@Table(name = "userss")
public class User {
    //Attributes and Columns
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "image")
    private String image;

    @Column(name = "auth0_Id", unique = true)
    private String auth0Id;

    // Empty Constructor
    public User() {
    }

    // Constructor with parameters
    public User(String name, String email, String image, String auth0Id) {
        this.name = name;
        this.email = email;
        this.image = image;
        this.auth0Id = auth0Id;
    }

    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }
}

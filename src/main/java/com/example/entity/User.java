package com.example.entity;

import java.util.List;



//import javax.persistence.*;

import jakarta.persistence.*;
import jakarta.persistence.Id;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userName;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Product> products;



    public User(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;

    }

    public User() {

    }


    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
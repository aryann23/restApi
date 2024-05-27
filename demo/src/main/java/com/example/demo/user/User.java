package com.example.demo.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "copsboot_user")
public class User {

    //Create a class User to hold all properties of your users.
    //UserRole defined as enum that contains all roles.
    @Id //making uuid id as primary key
    private UUID id;
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<UserRole> roles;

    protected User(){

    }

    //constructor
    public User(UUID id, String email, String password, Set<UserRole> roles){
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    //getter - setter functions
    public UUID getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public Set<UserRole> getRoles(){
        return roles;
    }

}

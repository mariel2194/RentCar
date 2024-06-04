package com.sg.rentcar.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private boolean activo;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}

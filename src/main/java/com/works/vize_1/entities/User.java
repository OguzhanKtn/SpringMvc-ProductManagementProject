package com.works.vize_1.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String name;
    private String surname;

    @Column(unique = true)
    private String email;

    private String password;
    private String remember;

}

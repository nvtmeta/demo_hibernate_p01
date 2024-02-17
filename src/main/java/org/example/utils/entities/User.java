package org.example.utils.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String firstName = "John Snow";
    private Integer age = 25;
    private Boolean locked = false;
}
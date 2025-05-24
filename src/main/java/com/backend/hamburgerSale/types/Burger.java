package com.backend.hamburgerSale.types;

import jakarta.persistence.*;

@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    // Getter ve Setter metodları
}

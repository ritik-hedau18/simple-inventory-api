package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class InventoryItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sku;
    private int quantity;
    private double price;
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 6347

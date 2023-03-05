package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class StockTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sku;
    private String type; // IN, OUT
    private int quantity;
    private LocalDateTime timestamp;
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 4607

// minor tweak: update verification rules and configs at 3983

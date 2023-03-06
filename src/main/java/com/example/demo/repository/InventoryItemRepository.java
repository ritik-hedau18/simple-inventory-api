package com.example.demo.repository;
import com.example.demo.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
    Optional<InventoryItem> findBySku(String sku);
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

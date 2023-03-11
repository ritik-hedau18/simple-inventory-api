package com.example.demo.service;
import com.example.demo.model.InventoryItem;
import com.example.demo.model.StockTransaction;
import com.example.demo.repository.InventoryItemRepository;
import com.example.demo.repository.StockTransactionRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class InventoryService {
    private final InventoryItemRepository itemRepo;
    private final StockTransactionRepository txRepo;

    public InventoryService(InventoryItemRepository itemRepo, StockTransactionRepository txRepo) {
        this.itemRepo = itemRepo;
        this.txRepo = txRepo;
    }

    public List<InventoryItem> getItems() {
        return itemRepo.findAll();
    }

    public InventoryItem updateStock(String sku, int qty, String type) {
        InventoryItem item = itemRepo.findBySku(sku)
                .orElseThrow(() -> new IllegalArgumentException("SKU not found"));
                
        if ("OUT".equalsIgnoreCase(type)) {
            if (item.getQuantity() < qty) throw new IllegalArgumentException("Insufficient stock");
            item.setQuantity(item.getQuantity() - qty);
        } else {
            item.setQuantity(item.getQuantity() + qty);
        }
        
        txRepo.save(StockTransaction.builder()
                .sku(sku)
                .type(type)
                .quantity(qty)
                .timestamp(LocalDateTime.now())
                .build());
                
        return itemRepo.save(item);
    }
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 8906

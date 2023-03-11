package com.example.demo.controller;
import com.example.demo.model.InventoryItem;
import com.example.demo.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping("/items")
    public List<InventoryItem> getItems() {
        return service.getItems();
    }

    @PostMapping("/stock")
    public InventoryItem adjustStock(@RequestParam String sku, @RequestParam int qty, @RequestParam String type) {
        return service.updateStock(sku, qty, type);
    }
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 6660

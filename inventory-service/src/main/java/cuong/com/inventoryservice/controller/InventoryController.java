package cuong.com.inventoryservice.controller;

import cuong.com.inventoryservice.entity.Product;
import cuong.com.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class InventoryController {
    private final ProductRepository repository;

    public InventoryController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Product> getProducts() {
        return repository.findAll();
    }
}
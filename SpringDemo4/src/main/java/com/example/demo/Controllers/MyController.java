package com.example.demo.Controllers;

import com.example.demo.Ezxception.ProductNotFoundException;
import com.example.demo.Repo.MyReposroty;
import com.example.demo.model.Product;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyReposroty repo;

    @GetMapping("/getproducts")
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @GetMapping("/getproducts/{id}")
    public Product getProductById(@PathVariable int id) {
        return repo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
    }

    @PostMapping("/addproducts")
    public String addProduct(@RequestBody  @Valid Product product) {
        repo.save(product);
        return "Product inserted successfully!";
    }

    @DeleteMapping("/deleteproducts/{id}")
    public String deleteProduct(@PathVariable int id) {
        if (!repo.existsById(id)) {
            throw new ProductNotFoundException("Cannot delete: Product not found with ID: " + id);
        }
        repo.deleteById(id);
        return "Product deleted successfully!";
    }

    @DeleteMapping("/deleteAllproducts")
    public String deleteAllProducts() {
        repo.deleteAll();
        return "All products deleted successfully!";
    }

    @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        Product existingProduct = repo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Cannot update: Product not found with ID: " + id));

        existingProduct.setPname(updatedProduct.getPname());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setDescription(updatedProduct.getDescription());

        repo.save(existingProduct);
        return "Product updated successfully!";
    }
}

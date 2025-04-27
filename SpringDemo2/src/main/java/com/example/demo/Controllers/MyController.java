package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.MyReposroty;
import com.example.demo.model.Product;

@RestController
public class MyController  {

	@Autowired
	private MyReposroty repo;
	
	 @GetMapping("/getproducts")
	 public List<Product> getAllProducts() {
		 // select * from product;
	        return repo.findAll();
	  }
	 
	 @GetMapping("/getproducts/{id}")
	 public Product getProductById(@PathVariable int id) {
		 
		 // select * from product where is = id
	     return repo.findById(id).orElse(null);
	 }
	 
	 @PostMapping("/addproducts")
	 public String addProduct(@RequestBody Product product) {
	     repo.save(product); // insert into product table
	     return "Product inserted successfully!";
	 }
	 @DeleteMapping("/deleteproducts/{id}")
	 public String deleteProduct(@PathVariable int id) {
	     repo.deleteById(id); // delete from product where id = ?
	     return "Product deleted successfully!";
	 }
	 @DeleteMapping("/deleteAllproducts")
	 public String deleteAllProducts() {
	     repo.deleteAll();  // DELETE FROM product;
	     return "All products deleted successfully!";
	 }
	 @PutMapping("/products/{id}")
	 public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
	     Product existingProduct = repo.findById(id).orElse(null);

	     if (existingProduct != null) {
	         existingProduct.setPname(updatedProduct.getPname());
	         existingProduct.setPrice(updatedProduct.getPrice());
	         existingProduct.setDescription(updatedProduct.getDescription());
	         repo.save(existingProduct);
	         return "Product updated successfully!";
	     } else {
	         return "Product not found!";
	     }
	 }

}

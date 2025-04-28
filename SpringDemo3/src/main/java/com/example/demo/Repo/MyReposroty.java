package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

public interface MyReposroty extends JpaRepository<Product, Integer> {

}

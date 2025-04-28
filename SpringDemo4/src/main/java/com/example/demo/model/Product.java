package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @Min(value = 1, message = "Product ID must be greater than 0")
    private int pid;

    @NotBlank(message = "Product name must not be blank")
    @Size(min = 2, max = 50, message = "Product name must be between 2 and 50 characters")
    private String pname;

    @Min(value = 1, message = "Price must be greater than 0")
    private int price;

    @NotBlank(message = "Description must not be blank")
    @Size(min = 5, max = 100, message = "Description must be between 5 and 100 characters")
    private String description;
}

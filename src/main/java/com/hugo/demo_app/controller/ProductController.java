package com.hugo.demo_app.controller;

import com.hugo.demo_app.entities.Department;
import com.hugo.demo_app.entities.Product;
import com.hugo.demo_app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getObjects() {
        List<Product> list = productRepository.findAll();

        return list;
    }
}

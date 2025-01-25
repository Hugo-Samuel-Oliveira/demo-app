package com.hugo.demo_app.repositories;

import com.hugo.demo_app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

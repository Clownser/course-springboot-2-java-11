package com.clownser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clownser.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

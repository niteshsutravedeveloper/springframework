package com.nt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Product;

public interface ProductRepositories extends JpaRepository<Product,Integer> {

}

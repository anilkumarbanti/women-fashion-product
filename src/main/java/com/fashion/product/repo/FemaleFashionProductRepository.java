package com.fashion.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashion.product.model.FemaleFashionProductWithDataBase;

public interface FemaleFashionProductRepository extends JpaRepository<FemaleFashionProductWithDataBase, String> {

}

package com.fashion.product.service;

import java.util.List;

import com.fashion.product.model.FemaleFashionProductWithDataBase;

public interface FemaleFashionProductService {
	
	FemaleFashionProductWithDataBase getProduct(String id);
	FemaleFashionProductWithDataBase createProduct(FemaleFashionProductWithDataBase product);
	FemaleFashionProductWithDataBase updateProduct(String id,FemaleFashionProductWithDataBase updatedProduct);
	String deleteProduct(String id);
	List<FemaleFashionProductWithDataBase> createProducts(List<FemaleFashionProductWithDataBase> products);

}

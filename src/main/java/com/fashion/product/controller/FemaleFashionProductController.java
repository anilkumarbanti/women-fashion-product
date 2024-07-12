package com.fashion.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashion.product.model.FemaleFashionProduct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/products")
public class FemaleFashionProductController {
	
	private Map<String, FemaleFashionProduct> productMap = new HashMap<>();
	
	//inserting data into hashmap
	
/**	@PostMapping
	public FemaleFashionProduct createProducts(@RequestBody FemaleFashionProduct products)
	{
		
			productMap.put(products.getId(), products);
			return products;
		
	}*/
	
	@PostMapping
	public void createProducts(@RequestBody List<FemaleFashionProduct> products)
	{
		
		for(FemaleFashionProduct product: products)
		{
			productMap.put(product.getId(), product);
		}
		
		
	}
	
	@GetMapping("/{id}")
	public FemaleFashionProduct getProduct(@PathVariable String id) {
		return productMap.get(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable String id)
	{
		productMap.remove(id);
	}
	
	@PutMapping("/{id}")
	public FemaleFashionProduct updateProduct(@PathVariable String id, @RequestBody FemaleFashionProduct updatedPRoduct)
	{
		
		updatedPRoduct.setId(id);
		return updatedPRoduct;
		
	}
	

}

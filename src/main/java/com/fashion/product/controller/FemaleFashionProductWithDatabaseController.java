package com.fashion.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashion.product.model.FemaleFashionProduct;
import com.fashion.product.model.FemaleFashionProductWithDataBase;
import com.fashion.product.service.FemaleFashionProductService;

@RestController
@RequestMapping("/product")
public class FemaleFashionProductWithDatabaseController {
	
	@Autowired
	private FemaleFashionProductService femaleFashionProductService;
	
	@GetMapping("/{id}")
	public FemaleFashionProductWithDataBase getProduct(@PathVariable String id)
	{
		return femaleFashionProductService.getProduct(id);
	}
	
/**	@PostMapping
	public FemaleFashionProductWithDataBase createProduct(@RequestBody FemaleFashionProductWithDataBase product)
	{
		return femaleFashionProductService.createProduct(product);
	}*/
	
	@PostMapping("/bulk")
	public List<FemaleFashionProductWithDataBase> 
	createProducts(@RequestBody List<FemaleFashionProductWithDataBase> products)
	{
		return femaleFashionProductService.createProducts(products);
	}
	
	@PutMapping("/{id}")
	public FemaleFashionProductWithDataBase updateProduct(@PathVariable String id, @RequestBody FemaleFashionProductWithDataBase updatedPRoduct)
	{
		

		return femaleFashionProductService.updateProduct(id, updatedPRoduct);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable String id)
	{
		return femaleFashionProductService.deleteProduct(id);
	}
	
	

}

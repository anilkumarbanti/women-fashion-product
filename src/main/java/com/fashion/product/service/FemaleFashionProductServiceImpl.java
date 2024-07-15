package com.fashion.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashion.product.model.FemaleFashionProductWithDataBase;
import com.fashion.product.repo.FemaleFashionProductRepository;

@Service
public class FemaleFashionProductServiceImpl implements FemaleFashionProductService {
	
	
	@Autowired
	private FemaleFashionProductRepository femaleFashionProductRepository;

	@Override
	public FemaleFashionProductWithDataBase getProduct(String id) {
		// TODO Auto-generated method stub
		return femaleFashionProductRepository.findById(id).orElse(null);
	}

	@Override
	public FemaleFashionProductWithDataBase createProduct(FemaleFashionProductWithDataBase product) {
		// TODO Auto-generated method stub
		return femaleFashionProductRepository.save(product);
	}

	@Override
	public List<FemaleFashionProductWithDataBase> createProducts(List<FemaleFashionProductWithDataBase> products) {
		// TODO Auto-generated method stub
		return femaleFashionProductRepository.saveAll(products);
	}

	@Override
	public FemaleFashionProductWithDataBase updateProduct(String id, FemaleFashionProductWithDataBase updatedProduct) {
		// TODO Auto-generated method stub
		if(femaleFashionProductRepository.existsById(id))
		{
			updatedProduct.setId(id);
			return femaleFashionProductRepository.save(updatedProduct);
		}
		else
		{
		return null;
	}
	}

	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		
		if(femaleFashionProductRepository.existsById(id))
		{
			femaleFashionProductRepository.deleteById(id);
			return "product with id"+id+"deleted successfully";
		}
		else
		{
		return "product with id"+id+"not found";
		}
	}

}

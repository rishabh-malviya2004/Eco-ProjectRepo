package com.rishabh.ecom_proj.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rishabh.ecom_proj.model.Product;
import com.rishabh.ecom_proj.repo.Productrepo;

@Service
public class ProductService {

	@Autowired
	private Productrepo productrepo;

	public List<Product> getAllProducts() {
		return productrepo.findAll();

	}

	public Product getProductById(int id) {
		return productrepo.findById(id).orElse(null);
	}

	public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		product.setImagedate(imageFile.getBytes());
		return productrepo.save(product);
	}

	public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException{
		product.setImagedate(imageFile.getBytes());
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		return productrepo.save(product);
		
	}

	public void deleteProduct(int id) {
		productrepo.deleteById(id);
	}

	public List<Product> searchProducts(String keyword) {
		
		return productrepo.searchProducts(keyword);
	}

}

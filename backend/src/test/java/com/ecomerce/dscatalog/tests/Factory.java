package com.ecomerce.dscatalog.tests;

import java.time.Instant;

import com.ecomerce.dscatalog.dto.ProductDTO;
import com.ecomerce.dscatalog.entities.Category;
import com.ecomerce.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 400.0, "https://img.com/img.png", Instant.parse("2020-07-14T10:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(2L, "Electronics");
	}
}

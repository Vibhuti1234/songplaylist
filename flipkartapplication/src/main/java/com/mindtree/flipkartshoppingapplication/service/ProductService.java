package com.mindtree.flipkartshoppingapplication.service;

import java.util.List;

import com.mindtree.flipkartshoppingapplication.dto.ProductDto;
import com.mindtree.flipkartshoppingapplication.entity.Product;
import com.mindtree.flipkartshoppingapplication.exception.FlipkartShoppingApplicationException;

public interface ProductService {

	void addProduct(int brandId, Product product) throws FlipkartShoppingApplicationException;

	List<ProductDto> getProductByBrand(int brandId) throws FlipkartShoppingApplicationException;

}

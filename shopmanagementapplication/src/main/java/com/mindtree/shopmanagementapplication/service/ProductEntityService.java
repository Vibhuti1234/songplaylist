package com.mindtree.shopmanagementapplication.service;

import java.util.List;

import com.mindtree.shopmanagementapplication.dto.ProductDto;
import com.mindtree.shopmanagementapplication.exception.ShopManagementControllerException;

public interface ProductEntityService {

	String addProduct(ProductDto productDto);

	List<ProductDto> getProduct() throws ShopManagementControllerException;

	List<ProductDto> getProductByBrand(int brandId) throws ShopManagementControllerException;



}

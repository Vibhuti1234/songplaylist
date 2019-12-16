package com.mindtree.shopmanagementapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.shopmanagementapplication.dto.ProductDto;
import com.mindtree.shopmanagementapplication.exception.ShopManagementControllerException;
import com.mindtree.shopmanagementapplication.service.BrandEntityService;
import com.mindtree.shopmanagementapplication.service.ProductEntityService;
import com.mindtree.shopmanagementapplication.service.ShopEntityService;

@RestController
public class ShopManagementController {
	@Autowired
	ShopEntityService shopService;
	@Autowired
	BrandEntityService brandService;
	@Autowired
	ProductEntityService productService;

	@PostMapping("/addProduct")
	public String addProduct(@RequestBody ProductDto productDto) {
		return productService.addProduct(productDto);
	}

	@GetMapping("/getProduct")
	public List<ProductDto> getProduct() throws ShopManagementControllerException {
		return productService.getProduct();
	}
	@GetMapping("/getProductByBrand/{brandId}")
	public List<ProductDto> getProductByBrand(@PathVariable int brandId) throws ShopManagementControllerException
	{
		return productService.getProductByBrand(brandId);
	}
}

package com.mindtree.flipkartshoppingapplication.service;

import java.util.List;

import com.mindtree.flipkartshoppingapplication.dto.BrandDto;
import com.mindtree.flipkartshoppingapplication.entity.Brand;
import com.mindtree.flipkartshoppingapplication.entity.Category;
import com.mindtree.flipkartshoppingapplication.exception.FlipkartShoppingApplicationException;

public interface BrandService {

	void addBrands(int categoryId, Brand brand) throws FlipkartShoppingApplicationException;
    List<Brand> getBrands();
	List<BrandDto> getBrandsByCategory(int categoryId) throws FlipkartShoppingApplicationException;

}

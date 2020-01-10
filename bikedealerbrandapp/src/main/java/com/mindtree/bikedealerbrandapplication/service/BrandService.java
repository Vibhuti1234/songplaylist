package com.mindtree.bikedealerbrandapplication.service;

import com.mindtree.bikedealerbrandapplication.entity.Brand;
import com.mindtree.bikedealerbrandapplication.exception.ServiceException;

public interface BrandService {
	public void addBrand(Brand brand) throws ServiceException;

	public Object getBrands();

}

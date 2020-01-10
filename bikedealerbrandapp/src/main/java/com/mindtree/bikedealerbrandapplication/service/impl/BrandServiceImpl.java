package com.mindtree.bikedealerbrandapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikedealerbrandapplication.entity.Brand;
import com.mindtree.bikedealerbrandapplication.exception.ServiceException;
import com.mindtree.bikedealerbrandapplication.repository.BikeRepository;
import com.mindtree.bikedealerbrandapplication.repository.BrandRepository;
import com.mindtree.bikedealerbrandapplication.repository.DealersRepository;
import com.mindtree.bikedealerbrandapplication.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	DealersRepository dealersRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	BikeRepository bikeRepository;
	@Override
	public void addBrand(Brand brand) throws ServiceException {
		List<Brand> brands = brandRepository.findAll();
		int count=0;
		for (Brand brand2 : brands) {
			if(brand2.getBrandName().compareToIgnoreCase(brand.getBrandName())==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			brandRepository.save(brand);
		}
		else
		{
			throw new ServiceException("Brand Already Exists");
		}
		
	}

	@Override
	public Object getBrands() {
		
		return brandRepository.findAll();
	}
}

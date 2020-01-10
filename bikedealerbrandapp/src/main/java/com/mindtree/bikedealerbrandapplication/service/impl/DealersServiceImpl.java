package com.mindtree.bikedealerbrandapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikedealerbrandapplication.entity.Brand;
import com.mindtree.bikedealerbrandapplication.entity.Dealers;
import com.mindtree.bikedealerbrandapplication.repository.BikeRepository;
import com.mindtree.bikedealerbrandapplication.repository.BrandRepository;
import com.mindtree.bikedealerbrandapplication.repository.DealersRepository;
import com.mindtree.bikedealerbrandapplication.service.DealersService;
@Service
public class DealersServiceImpl implements DealersService{
@Autowired
DealersRepository dealersRepository;
@Autowired
BrandRepository brandRepository;
@Autowired
BikeRepository bikeRepository;
@Override
public Object getDealers() {
	
	return dealersRepository.findAll();
}

@Override
public void addDealer(int brandId, int dealerId) {
	Brand brand=brandRepository.getOne(brandId);
	Dealers dealer=dealersRepository.getOne(dealerId);
	dealer.setBrand(brand);
	brand.getDealers().add(dealer);
	brandRepository.saveAndFlush(brand);
	
	
}

}

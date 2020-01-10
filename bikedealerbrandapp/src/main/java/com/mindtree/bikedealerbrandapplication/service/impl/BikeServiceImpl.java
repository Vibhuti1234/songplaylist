package com.mindtree.bikedealerbrandapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikedealerbrandapplication.entity.Bike;
import com.mindtree.bikedealerbrandapplication.entity.Brand;
import com.mindtree.bikedealerbrandapplication.entity.Dealers;
import com.mindtree.bikedealerbrandapplication.exception.ServiceException;
import com.mindtree.bikedealerbrandapplication.repository.BikeRepository;
import com.mindtree.bikedealerbrandapplication.repository.BrandRepository;
import com.mindtree.bikedealerbrandapplication.repository.DealersRepository;
import com.mindtree.bikedealerbrandapplication.service.BikeService;
@Service
public class BikeServiceImpl implements BikeService {
	@Autowired
	DealersRepository dealersRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	BikeRepository bikeRepository;
	@Override
	public void addBike(int brandId, Bike bike) {
		Brand brand=brandRepository.getOne(brandId);
		brand.getBikes().add(bike);
	double investment=brand.getInvestment()+bike.getBikePrice();
		brand.setInvestment(investment);
		brandRepository.saveAndFlush(brand);	
	}
	
	@Override
	public Object getBikes(String dealerName) throws ServiceException {
		List<Dealers> dealers = dealersRepository.findAll();
		Dealers dealer = dealers.stream().filter(i -> i.getDealerName().compareToIgnoreCase(dealerName)==0).findAny().orElseThrow(() -> new ServiceException("Dealer is not found !"));
		return dealer.getBrand().getBikes();	
	}
}

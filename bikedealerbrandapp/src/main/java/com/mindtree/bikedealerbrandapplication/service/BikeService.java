package com.mindtree.bikedealerbrandapplication.service;

import com.mindtree.bikedealerbrandapplication.entity.Bike;
import com.mindtree.bikedealerbrandapplication.exception.ServiceException;

public interface BikeService {
	public void addBike(int brandId, Bike bike);

	public Object getBikes(String dealerName) throws ServiceException;

}

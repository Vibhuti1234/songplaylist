package com.mindtree.blockmanagementsystem.service;

import java.util.List;

import com.mindtree.blockmanagementsystem.dto.DishesDto;
import com.mindtree.blockmanagementsystem.dto.ShopDto;
import com.mindtree.blockmanagementsystem.entity.Dishes;
import com.mindtree.blockmanagementsystem.exception.BlockManagementApplicationException;

public interface DishesService {

	String addDishToShop(Dishes dish, int shopId) throws BlockManagementApplicationException;

	List<DishesDto> displayDishInAscByShop(int shopId) throws BlockManagementApplicationException;

	List<DishesDto> displayDishInDscByShop(int shopId) throws BlockManagementApplicationException;

}

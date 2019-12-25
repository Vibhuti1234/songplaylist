package com.mindtree.blockmanagementsystem.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.blockmanagementsystem.dto.DishesDto;
import com.mindtree.blockmanagementsystem.dto.ShopDto;
import com.mindtree.blockmanagementsystem.entity.Dishes;
import com.mindtree.blockmanagementsystem.entity.Shop;
import com.mindtree.blockmanagementsystem.exception.BlockManagementApplicationException;
import com.mindtree.blockmanagementsystem.exception.InvalidShopIdException;
import com.mindtree.blockmanagementsystem.exception.InvalidTypeException;
import com.mindtree.blockmanagementsystem.exception.NoShopFoundException;
import com.mindtree.blockmanagementsystem.repository.BlockRepository;
import com.mindtree.blockmanagementsystem.repository.DishRepository;
import com.mindtree.blockmanagementsystem.repository.ShopRepository;
import com.mindtree.blockmanagementsystem.service.DishesService;
@Service
public class DishesServiceImpl implements DishesService{
	@Autowired
	BlockRepository blockRepository;
	@Autowired
	ShopRepository shopRepository;
	@Autowired
	DishRepository dishRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addDishToShop(Dishes dish, int shopId) throws BlockManagementApplicationException {
		// TODO Auto-generated method stub
		List<Shop> shops=shopRepository.findAll();
		Shop shop=shops.stream().filter(i->i.getShopId()==shopId).findAny().orElseThrow(()->new NoShopFoundException("Shop Not Found"));
	  if(shop.getRating()>4.5)
	  {
		  dish.setPrice(dish.getPrice()-0.1*dish.getPrice());
	  }
	  else if(shop.getRating()>3.5 && shop.getRating()<=4.5)
	  {
		  dish.setPrice(dish.getPrice()-0.05*dish.getPrice());
	  }
	  else if(shop.getRating()>2.5 && shop.getRating()<=3.5){
		  dish.setPrice(dish.getPrice()-dish.getPrice()/50);
	  }
	  if(dish.getType().equalsIgnoreCase("Veg")==false && dish.getType().equalsIgnoreCase("Non Veg")==false)
	  {
		  throw new InvalidTypeException("Thhis Type is not Allowed");
	  }
		shop.getDishes().add(dish);
		shopRepository.save(shop);
		return "success";
	}
	@Override
	public List<DishesDto> displayDishInAscByShop(int shopId) throws BlockManagementApplicationException {
		// TODO Auto-generated method stub
		List<Shop> shops=shopRepository.findAll();
		Shop shop=shops.stream().filter(i->i.getShopId()==shopId).findAny().orElseThrow(()->new InvalidShopIdException("Invalid Shop Id:"));
		List<Dishes> dishes=shop.getDishes();
		List<DishesDto> dishDtos=dishes.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		Collections.sort(dishDtos);
		return dishDtos;
	}
	private DishesDto convertEntityToDto(Dishes i) {
		
		return modelMapper.map(i, DishesDto.class);
	}
	@Override
	public List<DishesDto> displayDishInDscByShop(int shopId) throws BlockManagementApplicationException {
		
		List<Shop> shops=shopRepository.findAll();
		Shop shop=shops.stream().filter(i->i.getShopId()==shopId).findAny().orElseThrow(()->new InvalidShopIdException("Invalid Shop Id:"));
		List<Dishes> dishes=shop.getDishes();
		List<DishesDto> dishDtos=dishes.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		Collections.sort(dishDtos,Collections.reverseOrder());
		return dishDtos;
	}
}

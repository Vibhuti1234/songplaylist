package com.mindtree.blockmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.blockmanagementsystem.dto.DishesDto;
import com.mindtree.blockmanagementsystem.dto.ShopDto;
import com.mindtree.blockmanagementsystem.entity.Block;
import com.mindtree.blockmanagementsystem.entity.Dishes;
import com.mindtree.blockmanagementsystem.entity.Shop;
import com.mindtree.blockmanagementsystem.exception.BlockManagementApplicationException;
import com.mindtree.blockmanagementsystem.repository.BlockRepository;
import com.mindtree.blockmanagementsystem.repository.DishRepository;
import com.mindtree.blockmanagementsystem.repository.ShopRepository;
import com.mindtree.blockmanagementsystem.service.BlockService;
import com.mindtree.blockmanagementsystem.service.DishesService;
import com.mindtree.blockmanagementsystem.service.ShopService;

@RestController
public class BlockManagementController {

	@Autowired
	BlockService blockService;
	@Autowired
	ShopService shopService;
	@Autowired
	DishesService dishesService;
	@PostMapping("/addBlock")
	public String addBlock(@RequestBody Block block)
	{
		return blockService.addBlock(block);
	}
	@PostMapping("/addShop/{blockId}")
	public String addShopToBlock(@RequestBody Shop shop,@PathVariable int blockId) throws BlockManagementApplicationException
	{
		return shopService.addShop(shop,blockId);
	}
	@PostMapping("/addDishToShop/{shopId}")
	public String addDishToShop(@RequestBody Dishes dish,@PathVariable int shopId) throws BlockManagementApplicationException
	{
		return dishesService.addDishToShop(dish,shopId);
	}
	@GetMapping("/getShopByType/{shopType}")
	public List<ShopDto> getShopByType(@PathVariable String shopType) throws BlockManagementApplicationException
	{
		return shopService.getShopByType(shopType);
	}
	@GetMapping("/displayDishByShop/{shopId}")
	public List<DishesDto> displayDishAsc(@PathVariable int shopId) throws BlockManagementApplicationException
	{
		return dishesService.displayDishInAscByShop(shopId);
	}
	@GetMapping("/displayDishesByShop/{shopId}")
	public List<DishesDto> displayDishDsc(@PathVariable int shopId) throws BlockManagementApplicationException
	{
		return dishesService.displayDishInDscByShop(shopId);
	}
	@GetMapping("/displayAllShopsByBlock/{blockId}")
	public List<ShopDto> displayAllShopsByBlock(@PathVariable int blockId) throws BlockManagementApplicationException
	{
		return shopService.displayAllShopsByBlock(blockId);
	}
}

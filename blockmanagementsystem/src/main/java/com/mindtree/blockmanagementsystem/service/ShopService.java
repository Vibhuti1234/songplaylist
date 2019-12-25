package com.mindtree.blockmanagementsystem.service;

import java.util.List;

import com.mindtree.blockmanagementsystem.dto.ShopDto;
import com.mindtree.blockmanagementsystem.entity.Shop;
import com.mindtree.blockmanagementsystem.exception.BlockManagementApplicationException;

public interface ShopService {

	String addShop(Shop shop, int blockId) throws BlockManagementApplicationException;

	List<ShopDto> getShopByType(String shopType) throws BlockManagementApplicationException;

	List<ShopDto> displayAllShopsByBlock(int blockId) throws BlockManagementApplicationException;

}

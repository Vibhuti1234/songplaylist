package com.mindtree.blockmanagementsystem.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.blockmanagementsystem.dto.ShopDto;
import com.mindtree.blockmanagementsystem.entity.Block;
import com.mindtree.blockmanagementsystem.entity.Shop;
import com.mindtree.blockmanagementsystem.exception.BlockManagementApplicationException;
import com.mindtree.blockmanagementsystem.exception.InvalidShopTypeException;
import com.mindtree.blockmanagementsystem.exception.NoBlockFound;
import com.mindtree.blockmanagementsystem.repository.BlockRepository;
import com.mindtree.blockmanagementsystem.repository.DishRepository;
import com.mindtree.blockmanagementsystem.repository.ShopRepository;
import com.mindtree.blockmanagementsystem.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	BlockRepository blockRepository;
	@Autowired
	ShopRepository shopRepository;
	@Autowired
	DishRepository dishRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addShop(Shop shop, int blockId) throws BlockManagementApplicationException {
		// TODO Auto-generated method stub
		List<Block> blocks=blockRepository.findAll();
		Block block=blocks.stream().filter(i->i.getBlockId()==blockId).findAny().orElseThrow(()->new NoBlockFound("No Block Found"));
		//shopRepository.save(shop);
		if(shop.getShopType().equalsIgnoreCase("Chinese")==false && shop.getShopType().equalsIgnoreCase("South")==false && shop.getShopType().equalsIgnoreCase("North")==false)
		{
			throw new InvalidShopTypeException("Invalid Shop Type");
		}
            //		shopRepository.save(shop);
		block.getShops().add(shop);
		blockRepository.saveAndFlush(block);
		return "success";
	}
	@Override
	public List<ShopDto> getShopByType(String shopType) throws BlockManagementApplicationException {
		// TODO Auto-generated method stub
		List<Shop> shopList=shopRepository.findAll();
		List<Shop> shops=new ArrayList<Shop>();
		shopList.stream().forEach(i->{if(i.getShopType().equals(shopType)) {shops.add(i);}});
		if(shops.size()==0)
		{
			throw new InvalidShopTypeException("Invalid Shop Type");
		}
		List<ShopDto> shopDtos=shops.stream().map(i->converEntityToDto(i)).collect(Collectors.toList());
		return shopDtos;
	}
	private ShopDto converEntityToDto(Shop i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i, ShopDto.class);
	}
	@Override
	public List<ShopDto> displayAllShopsByBlock(int blockId) throws BlockManagementApplicationException {
		// TODO Auto-generated method stub
		List<Block> blocks=blockRepository.findAll();
		Block block=blocks.stream().filter(i->i.getBlockId()==blockId).findAny().orElseThrow(()->new NoBlockFound("No Block Found"));
		List<ShopDto> shopDtos=block.getShops().stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		return shopDtos;
	}
	private ShopDto convertEntityToDto(Shop i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i, ShopDto.class);

	}
	
}

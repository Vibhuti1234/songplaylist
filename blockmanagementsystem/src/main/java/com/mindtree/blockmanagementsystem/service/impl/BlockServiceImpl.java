package com.mindtree.blockmanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.blockmanagementsystem.entity.Block;
import com.mindtree.blockmanagementsystem.repository.BlockRepository;
import com.mindtree.blockmanagementsystem.repository.DishRepository;
import com.mindtree.blockmanagementsystem.repository.ShopRepository;
import com.mindtree.blockmanagementsystem.service.BlockService;
@Service
public class BlockServiceImpl implements BlockService{
@Autowired
BlockRepository blockRepository;
@Autowired
ShopRepository shopRepository;
@Autowired
DishRepository dishRepository;
@Override
public String addBlock(Block block) {
	// TODO Auto-generated method stub
	blockRepository.save(block);
	return "success";
}
}

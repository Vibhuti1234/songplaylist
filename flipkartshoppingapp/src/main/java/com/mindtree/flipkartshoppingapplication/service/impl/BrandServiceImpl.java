package com.mindtree.flipkartshoppingapplication.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.flipkartshoppingapplication.dto.BrandDto;
import com.mindtree.flipkartshoppingapplication.entity.Brand;
import com.mindtree.flipkartshoppingapplication.entity.Category;
import com.mindtree.flipkartshoppingapplication.exception.FlipkartShoppingApplicationException;
import com.mindtree.flipkartshoppingapplication.exception.NoBrandFoundException;
import com.mindtree.flipkartshoppingapplication.exception.NoCategoryfoundException;
import com.mindtree.flipkartshoppingapplication.repository.BrandRepository;
import com.mindtree.flipkartshoppingapplication.repository.CategoryRepository;
import com.mindtree.flipkartshoppingapplication.repository.ProductRepository;
import com.mindtree.flipkartshoppingapplication.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	ProductRepository productRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public void addBrands(int categoryId, Brand brand) throws FlipkartShoppingApplicationException {
		// TODO Auto-generated method stub
		Category category=categoryRepository.findAll().stream().filter(i->i.getCategoryId()==categoryId).findAny().orElseThrow(()->new NoBrandFoundException("No Brand Found"));
		System.out.println(brand.getBrandName());
		brand.getCategories().add(category);
		brandRepository.saveAndFlush(brand);
		
	}
	@Override
	public List<Brand> getBrands() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}
	@Override
	public List<BrandDto> getBrandsByCategory(int categoryId) throws FlipkartShoppingApplicationException {
		// TODO Auto-generated method stub
		Category category=categoryRepository.findAll().stream().filter(i->i.getCategoryId()==categoryId).findAny().orElseThrow(()->new NoCategoryfoundException("This category is not Available"));
		List<BrandDto> brandDtos=category.getBrands().stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		
		return brandDtos;
	}
	private BrandDto convertEntityToDto(Brand i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i, BrandDto.class);
	}
}

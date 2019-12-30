package com.mindtree.flipkartshoppingapplication.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.flipkartshoppingapplication.dto.ProductDto;
import com.mindtree.flipkartshoppingapplication.entity.Brand;
import com.mindtree.flipkartshoppingapplication.entity.Product;
import com.mindtree.flipkartshoppingapplication.exception.FlipkartShoppingApplicationException;
import com.mindtree.flipkartshoppingapplication.exception.NoSuchBrandException;
import com.mindtree.flipkartshoppingapplication.repository.BrandRepository;
import com.mindtree.flipkartshoppingapplication.repository.CategoryRepository;
import com.mindtree.flipkartshoppingapplication.repository.ProductRepository;
import com.mindtree.flipkartshoppingapplication.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	ProductRepository productRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public void addProduct(int brandId, Product product) throws FlipkartShoppingApplicationException {
		// TODO Auto-generated method stub
		Brand brand=brandRepository.findAll().stream().filter(i->i.getBrandId()==brandId).findAny().orElseThrow(()->new NoSuchBrandException("Brand Not found:"));
	     double price =product.getPrice()-product.getPrice()*(product.getDiscount()/100);
	     product.setPrice(price);
	     brand.getProducts().add(product);
	     brandRepository.saveAndFlush(brand);
	
	}
	@Override
	public List<ProductDto> getProductByBrand(int brandId) throws FlipkartShoppingApplicationException {
		// TODO Auto-generated method stub
		Brand brand =brandRepository.findAll().stream().filter(i->i.getBrandId()==brandId).findAny().orElseThrow(()->new NoSuchBrandException("No Such Brand Found:"));
		List<ProductDto> productDtos=brand.getProducts().stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		
		return productDtos;
	}
	private ProductDto convertEntityToDto(Product i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i,ProductDto.class);
	}
}

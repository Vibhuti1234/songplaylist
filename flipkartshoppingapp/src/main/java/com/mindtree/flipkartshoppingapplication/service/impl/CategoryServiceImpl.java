package com.mindtree.flipkartshoppingapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.flipkartshoppingapplication.entity.Category;
import com.mindtree.flipkartshoppingapplication.repository.BrandRepository;
import com.mindtree.flipkartshoppingapplication.repository.CategoryRepository;
import com.mindtree.flipkartshoppingapplication.repository.ProductRepository;
import com.mindtree.flipkartshoppingapplication.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
CategoryRepository categoryRepository;
@Autowired
BrandRepository brandRepository;
@Autowired
ProductRepository productRepository;
@Override
public void addCategory(Category category) {
	// TODO Auto-generated method stub
	categoryRepository.save(category);
	
}
@Override
public List<Category> getCategories() {
	// TODO Auto-generated method stub
	return categoryRepository.findAll();
}
}

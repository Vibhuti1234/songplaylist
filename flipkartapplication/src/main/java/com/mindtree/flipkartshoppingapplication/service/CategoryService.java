package com.mindtree.flipkartshoppingapplication.service;

import java.util.List;

import com.mindtree.flipkartshoppingapplication.entity.Category;

public interface CategoryService {

	void addCategory(Category category);

	List<Category> getCategories();

}

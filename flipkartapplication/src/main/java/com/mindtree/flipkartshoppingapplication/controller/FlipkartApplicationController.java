package com.mindtree.flipkartshoppingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.flipkartshoppingapplication.entity.Brand;
import com.mindtree.flipkartshoppingapplication.entity.Category;
import com.mindtree.flipkartshoppingapplication.entity.Product;
import com.mindtree.flipkartshoppingapplication.exception.FlipkartShoppingApplicationException;
import com.mindtree.flipkartshoppingapplication.service.BrandService;
import com.mindtree.flipkartshoppingapplication.service.CategoryService;
import com.mindtree.flipkartshoppingapplication.service.ProductService;

@Controller
public class FlipkartApplicationController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	@Autowired
	BrandService brandService;
	@RequestMapping("/")
	public String menu()
	{
		return "menu";
	}
	@RequestMapping("/addCategory")
	public String addCategory()
	{
		return "addCategory";
	}
	@PostMapping("/addCategories")
	public String addCategories(Category category)
	{   categoryService.addCategory(category);
		return "menu";
	}
	@RequestMapping("/addBrand")
	public String addBrand(Model model)
	{ List<Category> categories=categoryService.getCategories();
	  model.addAttribute("categories",categories);
		return "addBrand";
	}
	@PostMapping("/addBrands")
	public String addBrands(@RequestParam("categoryId") int categoryId,Brand brand) throws FlipkartShoppingApplicationException
	{   brandService.addBrands(categoryId,brand);
	    
		return "menu";
	}
	@RequestMapping("/addProduct")
	public String addProduct(Model model)
	{  model.addAttribute("brands", brandService.getBrands());
		return "addProduct";
		
	}
	@PostMapping("/addProducts")
	public String addProducts(@RequestParam("brandId") int brandId,Product product) throws FlipkartShoppingApplicationException
	{   productService.addProduct(brandId,product);
		return "menu";
	}
	@RequestMapping("/display")
	public String display(Model model)
	{
		model.addAttribute("categories", categoryService.getCategories());
		return "displayCategory";
	}
	@GetMapping("/displayBrand")
	public String displayBrand(Model model,@RequestParam("categoryId") int categoryId) throws FlipkartShoppingApplicationException
	{
		model.addAttribute("brands",brandService.getBrandsByCategory(categoryId));
		return "displayBrands";
	}
	@GetMapping("/displayProduct")
	public String displayProduct(@RequestParam("brandId") int brandId,Model model) throws FlipkartShoppingApplicationException
	{
		model.addAttribute("products",productService.getProductByBrand(brandId));
		return "displayProducts";
	}
}

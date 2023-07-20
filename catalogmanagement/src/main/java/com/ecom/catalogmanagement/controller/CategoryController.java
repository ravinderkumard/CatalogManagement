package com.ecom.catalogmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.catalogmanagement.domain.CategoryGroup;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@GetMapping
	public List<CategoryGroup> searchAllCategories(){
		
		CategoryGroup cg = new CategoryGroup();
		
		return Arrays.asList(cg);
	}
	
	@GetMapping("/{id}")
	public CategoryGroup getCategoryById() {
		return new CategoryGroup();
	}
	
	@PostMapping
	public CategoryGroup addCategory(){
		return new CategoryGroup();
	}
	
}

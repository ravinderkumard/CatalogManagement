package com.ecom.catalogmanagement.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.catalogmanagement.domain.CategoryGroup;
import com.ecom.catalogmanagement.repository.CategoryGroupRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryGroupRepository catGroupRepo;
	
	@GetMapping
	public List<CategoryGroup> searchAllCategories(){
		
		return catGroupRepo.findAll();
	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {
    }
	
	@GetMapping("/{id}")
	public CategoryGroup getCategoryById(@PathVariable String id) {
		Optional<CategoryGroup> result = catGroupRepo.findById(Integer.valueOf(id));
		return result.orElseThrow(ResourceNotFoundException::new);
	}
	
	@PostMapping
	public CategoryGroup addCategory(){
		CategoryGroup cg = new CategoryGroup();
		cg.setName("Hello");
		cg.setImage("Hello");
		cg.setShortDescription("Hello");
		cg.setLongDescription("Hello");
		cg.setThumbnail("Hello");
		cg.setCatGroupCode("HELLO");
		cg.setParentCatGroup(null);
		return catGroupRepo.save(cg);
	}
	
}

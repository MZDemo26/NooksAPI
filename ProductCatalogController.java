package com.edu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.Model.ProductCatalog;
import com.edu.Repository.ProductCatalogRepository;


@RestController
public class ProductCatalogController {

	@Autowired
	ProductCatalogRepository repo;
	
	@GetMapping("/product/all")
	public List<ProductCatalog> getAllData(){
		return repo.findAll();
	}
}

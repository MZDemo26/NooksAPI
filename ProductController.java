package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.main.ProductCatalogImpl;
import com.edu.model.ProductCatalog;

@Controller
public class ProductController {

	@RequestMapping("/product/add")
	public String m1(ModelMap map) {
		map.addAttribute("productdata", new ProductCatalog());
		return "ProductCatalog";
	}

	@RequestMapping("/product/newadd")
	public String m2(@ModelAttribute("productdata") ProductCatalog pcg) {
		ProductCatalogImpl pc = new ProductCatalogImpl();
		pcg.setProductStatus("Available");
		pc.addProduct(pcg);
		return "login";
	}
	
	@RequestMapping("/product/displayproduct")
	public String m3(ModelMap map) {
		map.addAttribute("pdata", ProductCatalogImpl.getAllProducts());
		return "ProductsDisplay";
	}
	
	@RequestMapping("/product/viewproduct/{id}")
	public String m5(@PathVariable("id") int pid, ModelMap map) {
		map.addAttribute("singleproduct", ProductCatalogImpl.getproductsByID(pid));
		return "ViewProduct";
	}
	
	@RequestMapping("/payment")
	public String m4(ModelMap map) {
		return "payment";
	}
	
	@RequestMapping("/product/modify/{id}")
	public String m6(@PathVariable("id") int pid, ModelMap map) {
		map.addAttribute("modifyproduct", ProductCatalogImpl.displayproductsByID(pid));
		return "ProductCatalog";
	}

	@RequestMapping("/product/modifyprod")
	public String m7(@ModelAttribute ("modifyproduct") ProductCatalog p) {
		ProductCatalogImpl.updateProduct(p);
		return "index";
	}
}

package com.lti.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.product.model.AddProduct;
import com.lti.product.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/productRest/api")
public class ProductController 
{
		@Autowired
		ProductService prodService;
	
	
		@GetMapping("/products")
		public List<AddProduct> getAll()
		{
			return prodService.getProducts();
			
		}
		
		@PostMapping("/products")
		public boolean addingProduct(@RequestBody AddProduct addproduct)
		{
			return prodService.addingProduct(addproduct);
		
		}
		
		
		
}

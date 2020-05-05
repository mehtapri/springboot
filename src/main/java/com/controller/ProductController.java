package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.ProductBean;
@RestController
public class ProductController {
	
List<ProductBean> products = new ArrayList<ProductBean>();
	
	@PostMapping("/addProduct")
	public void addProduct(ProductBean productBean) {
		
		products.add(productBean);
		
	}
	
	@GetMapping("/viewProduct")
	public ProductBean viewProduct() {
		
		ProductBean productBean = null;
		for(int i=0;i<products.size();i++) {
			
			productBean = products.get(i);
			System.out.println(productBean.getpId());
			System.out.println(productBean.getpName());
			
		}
		return productBean;
		
	}
	


}

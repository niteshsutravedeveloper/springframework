package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.ProductDto;
import com.nt.service.ProductManagerService;

public class ProductManagerController extends AbstractController {
private ProductManagerService productManagerService;


	public void setProductManagerService(ProductManagerService productManagerService) {
	this.productManagerService = productManagerService;
}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		List<ProductDto> allProducts = productManagerService.getAllProducts();
		ModelAndView lvn=new ModelAndView();
		lvn.setViewName("productView");
		lvn.addObject("products",allProducts);
		
		return lvn;
	}
	

}

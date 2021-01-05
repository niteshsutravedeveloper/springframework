package com.nt.service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.nt.dto.ProductDto;
import com.nt.entity.Product;
import com.nt.repositories.ProductRepositories;

public class ProductManagerServiceImpl implements ProductManagerService{
private ProductRepositories ProductRepositories;


	

	public void setProductRepositories(ProductRepositories productRepositories) {
	ProductRepositories = productRepositories;
}




	@Override
	public List<ProductDto> getAllProducts() {
		// TODO Auto-generated method stub
	List<Product> productlist = ProductRepositories.findAll();
	List<ProductDto> productdto=null;
	Function<Product, ProductDto> function=(product)->{ ProductDto dto=new ProductDto();
	BeanUtils.copyProperties(product, dto);
	return dto;
	};
	productdto = productlist.stream().map(function).collect(Collectors.toList());
		return productdto;
	}
	

}

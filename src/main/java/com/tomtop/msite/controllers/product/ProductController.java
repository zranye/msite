package com.tomtop.msite.controllers.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tomtop.msite.entitys.pgsql.product.ProductBase;
import com.tomtop.msite.services.product.IProductBaseService;

@RestController
@RequestMapping("/products")
//@MapperScan("com.tomtop.msite.pgsql.mapper")
public class ProductController {

	@Autowired
	private IProductBaseService iProductBaseService;
	
	@RequestMapping("/{id}")
	public @ResponseBody ProductBase getProductBase(@PathVariable(value="id") Integer iid){
		return iProductBaseService.getProductBaseByListingId(iid);
	}
}

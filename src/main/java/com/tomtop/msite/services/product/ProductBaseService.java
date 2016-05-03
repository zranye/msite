package com.tomtop.msite.services.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomtop.msite.TargetDataSource;
import com.tomtop.msite.entitys.pgsql.product.ProductBase;
import com.tomtop.msite.mapper.pgsql.product.ProductBaseMapper;

@Service
@MapperScan("com.tomtop.msite.mapper.pgsql.product")
public class ProductBaseService implements IProductBaseService {
	
	@Autowired
	private ProductBaseMapper productBaseMapper;

	@TargetDataSource(name="product")
	@Override
	public ProductBase getProductBaseByListingId(Integer iid) {
		return productBaseMapper.getProductBaseByListingId(iid);
	}

}

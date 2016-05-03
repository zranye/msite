package com.tomtop.msite.mapper.pgsql.product;

import org.apache.ibatis.annotations.Param;

import com.tomtop.msite.entitys.pgsql.product.ProductBase;

public interface ProductBaseMapper {

	ProductBase getProductBaseByListingId(Integer iid);
}

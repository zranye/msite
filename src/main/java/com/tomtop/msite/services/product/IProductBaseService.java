package com.tomtop.msite.services.product;

import com.tomtop.msite.entitys.pgsql.product.ProductBase;

public interface IProductBaseService {

	ProductBase getProductBaseByListingId(Integer clistingid);
}

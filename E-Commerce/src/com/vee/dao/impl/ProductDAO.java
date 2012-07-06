package com.vee.dao.impl;

import java.util.List;

import com.vee.dao.BaseDAO;
import com.vee.model.Product;

public class ProductDAO extends BaseDAO<Product, Integer> {

	public ProductDAO() {
		// TODO Auto-generated constructor stub
		super(Product.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) getHibernateTemplate().find(
				"from Product where category_id != 9999");
	}
}

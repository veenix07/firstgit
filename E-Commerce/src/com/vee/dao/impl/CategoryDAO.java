package com.vee.dao.impl;

import java.util.List;

import com.vee.dao.BaseDAO;
import com.vee.model.Category;

public class CategoryDAO extends BaseDAO<Category, Integer> {
	public CategoryDAO() {
		// TODO Auto-generated constructor stub
		super(Category.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>) getHibernateTemplate().find(
				"from Category order by categoryName");
	}
}

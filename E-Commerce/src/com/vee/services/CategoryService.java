package com.vee.services;

import java.util.List;

import com.vee.dao.IBaseDAO;
import com.vee.model.Category;

public class CategoryService implements GenericService<Category> {
	private IBaseDAO<Category, Integer> categoryDAO;

	public IBaseDAO<Category, Integer> getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(IBaseDAO<Category, Integer> categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	@Override
	public void save(Category entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category getEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}

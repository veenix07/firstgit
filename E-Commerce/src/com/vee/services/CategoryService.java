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
		getCategoryDAO().save(entity);
	}

	@Override
	public Category getEntity(int id) {
		// TODO Auto-generated method stub
		return getCategoryDAO().findByID(id);
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub
		getCategoryDAO().save(entity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getCategoryDAO().delete(getCategoryDAO().findByID(id));
	}

	@Override
	public List<Category> getList() {
		// TODO Auto-generated method stub
		return getCategoryDAO().findAll();
	}

	@Override
	public List<Category> getListByColumn(String colName, Object value) {
		// TODO Auto-generated method stub
		return getCategoryDAO().findByColumn(colName, value);
	}

	@Override
	public List<Category> getListByColumns(String[] colsName, Object[] values) {
		// TODO Auto-generated method stub
		return getCategoryDAO().findByColumns(colsName, values);
	}

}

package com.vee.services;

import java.util.List;

import com.vee.dao.IBaseDAO;
import com.vee.model.User;

public class UserService implements GenericService<User> {
	private IBaseDAO<User, Integer> userDAO;

	public IBaseDAO<User, Integer> getUserDAO() {
		return userDAO;
	}

	public void setCategoryDAO(IBaseDAO<User, Integer> userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		getUserDAO().save(entity);
	}

	@Override
	public User getEntity(int id) {
		// TODO Auto-generated method stub
		return getUserDAO().findByID(id);
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		getUserDAO().save(entity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getUserDAO().delete(getUserDAO().findByID(id));
	}

	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		return getUserDAO().findAll();
	}

	@Override
	public List<User> getListByColumn(String colName, Object value) {
		// TODO Auto-generated method stub
		return getUserDAO().findByColumn(colName, value);
	}

	@Override
	public List<User> getListByColumns(String[] colsName, Object[] values) {
		// TODO Auto-generated method stub
		return getUserDAO().findByColumns(colsName, values);
	}

}

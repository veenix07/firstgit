package com.vee.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDAO<T, ID extends Serializable> {
	public void delete(T entity);

	public void save(T entity);

	public T findByID(int id);

	public List<T> findAll();
}

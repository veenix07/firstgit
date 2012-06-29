package com.vee.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDAO<T, ID extends Serializable> {
	public void delete(T entity);

	public void save(T entity);

	public T findByID(int id);

	public List<T> findAll();

	public List<T> findByColumn(String colName, Object value);

	public List<T> findByColumns(String[] colsName, Object[] values);
}

package com.vee.services;

import java.util.List;

public interface GenericService<T> {

	public void save(T entity);

	public T getEntity(int id);

	public void update(T entity);

	public void delete(int id);

	public List<T> getList();

	public List<T> getListByColumn(String colName, Object value);

	public List<T> getListByColumns(String[] colsName, Object[] values);
}

package com.vee.services;

import java.util.List;

public interface GenericService<T> {
	
	public void save(T entity);

	public T getEntity(int id);

	public void update(T entity);

	public void delete(int id);
	
	public List<T> getList();
}

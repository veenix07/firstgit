package com.vee.services;

import java.util.List;

import com.vee.dao.IBaseDAO;
import com.vee.model.Image;

public class ImageService implements GenericService<Image> {

	private IBaseDAO<Image, Integer> imageDAO;

	public IBaseDAO<Image, Integer> getImageDAO() {
		return imageDAO;
	}

	public void setImageDAO(IBaseDAO<Image, Integer> imageDAO) {
		this.imageDAO = imageDAO;
	}

	@Override
	public void save(Image entity) {
		// TODO Auto-generated method stub
		getImageDAO().save(entity);
	}

	@Override
	public Image getEntity(int id) {
		// TODO Auto-generated method stub
		return getImageDAO().findByID(id);
	}

	@Override
	public void update(Image entity) {
		// TODO Auto-generated method stub
		getImageDAO().save(entity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getImageDAO().delete(getImageDAO().findByID(id));
	}

	@Override
	public List<Image> getList() {
		// TODO Auto-generated method stub
		return getImageDAO().findAll();
	}

	@Override
	public List<Image> getListByColumn(String colName, Object value) {
		// TODO Auto-generated method stub
		return getImageDAO().findByColumn(colName, value);
	}

	@Override
	public List<Image> getListByColumns(String[] colsName, Object[] values) {
		// TODO Auto-generated method stub
		return getImageDAO().findByColumns(colsName, values);
	}
}

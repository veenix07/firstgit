package com.vee.dao.impl;

import com.vee.dao.BaseDAO;
import com.vee.model.Image;

public class ImageDAO extends BaseDAO<Image, Integer>{
	public ImageDAO() {
		// TODO Auto-generated constructor stub
		super(Image.class);
	}

	// unused
	// @Override
	// public void batchInsert(List<Image> entities) {
	// // TODO Auto-generated method stub
	// getHibernateTemplate().saveOrUpdateAll(entities);
	// }

}

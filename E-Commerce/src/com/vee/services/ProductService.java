package com.vee.services;

import java.util.List;

import com.vee.dao.IBaseDAO;
import com.vee.model.Product;

public class ProductService implements GenericService<Product> {
//	private static Logger log = Logger.getLogger(ProductService.class);
	private IBaseDAO<Product, Integer> productDAO;

	public IBaseDAO<Product, Integer> getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(IBaseDAO<Product, Integer> productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public void save(Product entity) {
		// TODO Auto-generated method stub
		getProductDAO().save(entity);
	}

	@Override
	public Product getEntity(int id) {
		// TODO Auto-generated method stub
		return getProductDAO().findByID(id);
	}

	@Override
	public void update(Product entity) {
		// TODO Auto-generated method stub
		getProductDAO().save(entity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getProductDAO().delete(getProductDAO().findByID(id));
	}

	@Override
	public List<Product> getList() {
		// TODO Auto-generated method stub
		return getProductDAO().findAll();
	}

}

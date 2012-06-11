package com.vee.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class BaseDAO<T, ID extends Serializable> implements
		IBaseDAO<T, ID> {
	protected static Logger log = Logger.getLogger("DAO");
	private Class<T> persistenceClass;
	private HibernateTemplate hibernateTemplate;

	public BaseDAO() {
		// TODO Auto-generated constructor stub
	}

	public BaseDAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Transactional(readOnly = false)
	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(entity);
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(entity);
	}

	@Override
	public T findByID(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(persistenceClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		log.info(persistenceClass.toString());
		return (List<T>) getHibernateTemplate().find(
				"from " + persistenceClass.getName());
	}

}

package com.reglamb.projvehimerc.dao.hibernate.ubigeo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.DistritoDao;
import com.reglamb.projvehimerc.domain.ubigeo.Distrito;

@Repository("distritoDao")
public class DistritoDaoHibernate implements DistritoDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Distrito get(Long id) {
		// TODO Auto-generated method stub
		return (Distrito)sessionFactory.getCurrentSession().get(Distrito.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `DISTRITO`").list();
	}

	@Override
	public void save(Distrito object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Distrito object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveDistrito(Distrito distrito) {
//		getHibernateTemplate().saveOrUpdate(distrito);		
		
	}

	@Override
	public void deleteDistrito(String distrito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Distrito> getAllDistrito(Distrito distrito) {
//		return getHibernateTemplate().find("from "
//                + Distrito.class.getName());
		return null;
	}

	@Override
	public Distrito selectDistritoById(Long iddistrito) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Distrito object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}

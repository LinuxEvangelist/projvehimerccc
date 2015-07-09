package com.reglamb.projvehimerc.dao.hibernate.ubigeo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.ProvinciaDao;
import com.reglamb.projvehimerc.domain.ubigeo.Provincia;

@Repository("provinciaDao")
public class ProvinciaDaoHibernate implements ProvinciaDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Provincia get(Long id) {
		// TODO Auto-generated method stub
		return (Provincia)sessionFactory.getCurrentSession().get(Provincia.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Provincia> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `PROVINCIA`").list();
	}

	@Override
	public void save(Provincia object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Provincia object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveProvincia(Provincia provincia) {
//		getHibernateTemplate().saveOrUpdate(provincia);		
		
	}

	@Override
	public void deleteProvincia(String provincia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Provincia> getAllProvincia(Provincia provincia) {
//		return getHibernateTemplate().find("from "
//                + Provincia.class.getName());
		return null;
	}

	@Override
	public Provincia selectProvinciaById(Long idprovincia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Provincia object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}

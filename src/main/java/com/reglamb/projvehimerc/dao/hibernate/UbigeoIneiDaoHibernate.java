package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.UbigeoIneiDao;
import com.reglamb.projvehimerc.domain.Ubigeo_Inei;

@Repository("ubigeoIneiTransDao")
public class UbigeoIneiDaoHibernate implements UbigeoIneiDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Ubigeo_Inei get(Long id) {
		// TODO Auto-generated method stub
		return (Ubigeo_Inei)sessionFactory.getCurrentSession().get(Ubigeo_Inei.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ubigeo_Inei> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `UBIGEO_INEI`").list();

	}

	@Override
	public void save(Ubigeo_Inei object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);	
	}

	@Override
	public void delete(Ubigeo_Inei object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);	
	}
	@Override
	public void update(Ubigeo_Inei object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);	
	}

	@Override
	public void saveUbigeoInei(Ubigeo_Inei ubigeo) {
//		getHibernateTemplate().saveOrUpdate(ubigeo);		
	}

	@Override
	public void deleteUbigeoInei(String ubigeo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ubigeo_Inei> getAllUbigeoInei(Ubigeo_Inei ubigeo) {
//		return getHibernateTemplate().find("from "
//                + Ubigeo_Inei.class.getName());
		return null;
	}

	@Override
	public Ubigeo_Inei selectUbigeoIneiById(Long idubigeo) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

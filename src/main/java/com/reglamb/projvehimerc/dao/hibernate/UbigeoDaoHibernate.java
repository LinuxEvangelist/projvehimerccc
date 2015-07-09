package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.UbigeoDao;
import com.reglamb.projvehimerc.domain.Ubigeo_Transportista;

@Repository("ubigeoTransDao")
public class UbigeoDaoHibernate implements UbigeoDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Ubigeo_Transportista get(Long id) {
		// TODO Auto-generated method stub
		return (Ubigeo_Transportista)sessionFactory.getCurrentSession().get(Ubigeo_Transportista.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ubigeo_Transportista> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `UBIGEO`").list();
	}

	@Override
	public void save(Ubigeo_Transportista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);		

	}

	@Override
	public void delete(Ubigeo_Transportista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);		

	}
	
	@Override
	public void update(Ubigeo_Transportista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);		

	}

	@Override
	public void saveUbigeo(Ubigeo_Transportista ubigeo) {
//		getHibernateTemplate().saveOrUpdate(ubigeo);		
	}

	@Override
	public void deleteUbigeo(String ubigeo) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Ubigeo_Transportista> getAllUbigeo(Ubigeo_Transportista ubigeo) {
//		return getHibernateTemplate().find("from "
//                + Ubigeo_Transportista.class.getName());
		return null;
	}

	@Override
	public Ubigeo_Transportista selectUbigeoById(Long idubigeo) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
